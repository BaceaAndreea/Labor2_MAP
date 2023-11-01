package UI;

import Controller.*;
import Domain.*;
import Repository.*;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public ArztController arztController;
    public PatientController patientController;

    public UserInterface(ArztController arztController) {
        this.arztController = arztController;
    }

    public static void Menu() {
        System.out.println("1. Doctor.");
        System.out.println("2. Patient.");
        System.out.println("3. Drug.");
        System.out.println("4. Operation.");
        System.out.println("5. Speciality.");
        System.out.println("6. Illness.");
        System.out.println("7. Office.");
        System.out.println("8. Consult.");
        System.out.println("9. Hospital.");
    }

    public static void Menu2() {
        System.out.println("Who uses the database?");
        System.out.println("1. Patient");
        System.out.println("2. Hospital staff");
        System.out.println("Enter your choice: ");
    }

    public static void Menu3() {
        System.out.println("1. Add.");
        System.out.println("2. Update.");
        System.out.println("3. Delete.");
        System.out.println("4. See all.");
        System.out.println("What do you pick?.");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            Menu2();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("First we need to get to know you, please enter your name ");
                    String name1 = scanner.nextLine();
                    break;
                case 2:
                    Menu3();
                    int choice2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice2) {
                        case 1:
                            Menu();
                            int choice3 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice3) {
                                case 1:
                                    addDoctor();
                                    break;
                                default:
                                    System.out.println("Invalid choice.\n");
                                    break;
                            }
                            break;
                        case 2:
                            Menu();
                            break;
                        case 3:
                            Menu();
                            int choice6 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice6) {
                                case 1:
                                    deleteDoctor();
                                    break;
                                case 2:
                                    deletePatient();
                                    break;
                                case 3:
                                    deleteDrug();
                                    break;
                                case 4:
                                    deleteOperation();
                                    break;
                                case 5:
                                    deleteSpeciality();
                                    break;
                                case 6:
                                    deleteIllness();
                                    break;
                                default:
                                    System.out.println("Invalid choice.\n");
                                    break;
                            }
                            break;
                        case 4:
                            Menu();
                            int choice4 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice4) {
                                case 1:
                                    for (Arzt arzt : arztController.readAll()) {
                                        System.out.println(arzt.toString());
                                        break;
                                    }
                                    break;
                                default:
                                    System.out.println("Invalid choice.\n");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid choice.\n");
                            break;
                    }
                    String answer = "-";
                    while (!answer.equals("no") && !answer.equals("yes")) {
                        System.out.println("\nWant to continue? (yes/ no)\n");
                        answer = scanner.nextLine();
                        if (answer.equals("no")) {
                            System.out.println("Bye.\n");
                            stop = true;
                        } else if (!answer.equals("yes")) {
                            System.out.println("Answer not valid. Try again.\n");
                        }
                    }
            }
        }
    }
    public void addDoctor () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID Doctor: ");
        int arztID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name Doctor: ");
        String name = scanner.nextLine();
        System.out.print("Vorname Doctor: ");
        String vorname = scanner.nextLine();
        System.out.print("Geburstdatum Doctor: ");
        String geburstdatum = scanner.nextLine();
        System.out.print("KrankenhausID Doctor: ");
        int KrankenhausID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kontakttelefon Doctor: ");
        String kontakttelefon = scanner.nextLine();
        System.out.print("SpecialityID Doctor: ");
        int spezialisierungID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("OfficeID Doctor: ");
        int kabinettID = scanner.nextInt();
        scanner.nextLine();
        arztController.addArzt(arztID, name, vorname, geburstdatum, KrankenhausID, kontakttelefon, spezialisierungID, kabinettID);

    }

}