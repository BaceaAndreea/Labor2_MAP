package UI;

import Controller.*;
import Domain.Doctor;
import Domain.Patient;

import java.util.ArrayList;
import java.util.Scanner;


public class Start {
    public static DoctorController doctorController;
    public static PatientController patientController;
    public static MedicationController medicationController;
    public static SurgeryController surgeryController;
    public static SpecializationController specializationController;
    public static DiseaseController diseaseController;
    public static ConsultationController consultationController;
    public static CabinetController cabinetController;
    public static HospitalController hospitalController;

    public static void RUN() {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            DisplayMenu2();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    System.out.println("First we want to get to know you: ");
                    break;
                case 2:
                    DisplayMenu3();
                    switch (Integer.parseInt(scanner.nextLine())) {
                        case 1:
                            Menu1();
                            break;
                        case 2:
                            Menu2();
                            break;
                        case 3:
                            Menu3();
                            break;
                        case 4:
                            Menu4();
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
        }
       answer = continueLoop(answer);
    }
    public static void Menu1(){{
        DisplayMenu1();
        Scanner scanner = new Scanner(System.in);
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                doctorController.add(ReadFromUserDoctor.readNewObjectData());
                break;
            case 2:
                patientController.add(ReadFromUserPatient.readNewObjectData());
                break;
            case 3:
                medicationController.add(ReadFromUserMedicine.readNewObjectData());
                break;
            case 4:
                surgeryController.add(ReadFromUserSurgery.readNewObjectData());
                break;
            case 5:
                specializationController.add(ReadFromUserDisease.readNewObjectData());
                break;
            case 6:
                diseaseController.add(ReadFromUserDisease.readNewObjectData());
                break;
            case 7:
                cabinetController.add(ReadFromUserCabinet.readNewObjectData());
                break;
            case 8:
                consultationController.add(ReadFromUserConsultation.readNewObjectData());
                break;
            case 9:
                hospitalController.add(ReadFromUserHospital.readNewObjectData());
            default:
                System.out.println("Invalid choice.\n");
                break;
        }
    }
    }

    public static void Menu2(){
        DisplayMenu1();
        Scanner scanner = new Scanner(System.in);
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                doctorController.update(ReadFromUserDoctor.readIdentifier(), ReadFromUserDoctor.readNewObjectData());
                break;
            case 2:
                patientController.update(ReadFromUserPatient.readIdentifier(), ReadFromUserPatient.readNewObjectData());
                break;
            case 3:
                medicationController.update(ReadFromUserMedicine.readIdentifier(), ReadFromUserMedicine.readNewObjectData());
                break;
            case 4:
                surgeryController.update(ReadFromUserSurgery.readIdentifier(), ReadFromUserSurgery.readNewObjectData());
                break;
            case 5:
                specializationController.update(ReadFromUserSpecialization.readIdentifier(), ReadFromUserDisease.readNewObjectData());
                break;
            case 6:
                diseaseController.update(ReadFromUserDisease.readIdentifier(), ReadFromUserDisease.readNewObjectData());
                break;
            case 7:
                cabinetController.update(ReadFromUserCabinet.readIdentifier(), ReadFromUserCabinet.readNewObjectData());
                break;
            case 8:
                consultationController.update(ReadFromUserConsultation.readIdentifier(), ReadFromUserConsultation.readNewObjectData());
                break;
            case 9:
                hospitalController.update(ReadFromUserHospital.readIdentifier(), ReadFromUserHospital.readNewObjectData());
            default:
                System.out.println("Invalid choice.\n");
                break;
        }
    }

    public static void Menu3(){
        DisplayMenu1();
        Scanner scanner = new Scanner(System.in);
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                doctorController.delete(ReadFromUserDoctor.readIdentifier());
                break;
            case 2:
                patientController.delete(ReadFromUserPatient.readIdentifier());
                break;
            case 3:
                medicationController.delete(ReadFromUserMedicine.readIdentifier());
                break;
            case 4:
                surgeryController.delete(ReadFromUserSurgery.readIdentifier());
                break;
            case 5:
                specializationController.delete(ReadFromUserSpecialization.readIdentifier());
                break;
            case 6:
                diseaseController.delete(ReadFromUserDisease.readIdentifier());
                break;
            case 7:
                cabinetController.delete(ReadFromUserCabinet.readIdentifier());
                break;
            case 8:
                consultationController.delete(ReadFromUserConsultation.readIdentifier());
                break;
            case 9:
                hospitalController.delete(ReadFromUserHospital.readIdentifier());
            default:
                System.out.println("Invalid choice.\n");
                break;
        }
    }

    public static void Menu4(){
        DisplayMenu1();
        Scanner scanner = new Scanner(System.in);
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                System.out.println(doctorController.readAll());
                break;
            case 2:
                System.out.println(patientController.readAll());
                break;
            case 3:
                System.out.println(medicationController.readAll());
                break;
            case 4:
                System.out.println(surgeryController.readAll());
                break;
            case 5:
                System.out.println(specializationController.readAll());
                break;
            case 6:
                System.out.println(diseaseController.readAll());
                break;
            case 7:
                System.out.println(cabinetController.readAll());
                break;
            case 8:
                System.out.println(consultationController.readAll());
                break;
            default:
                System.out.println("Invalid choice.\n");
                break;
        }
    }

    public static void DisplayMenu1() {
        System.out.println("1. Doctor.");
        System.out.println("2. Patient.");
        System.out.println("3. Medication.");
        System.out.println("4. Operation.");
        System.out.println("5. Specialization.");
        System.out.println("6. Disease.");
        System.out.println("7. Cabinet.");
        System.out.println("8. Consultation.");
        System.out.println("9. Hospital.");
    }

    public static void DisplayMenu2() {
        System.out.println("Who uses the database?");
        System.out.println("1. Patient");
        System.out.println("2. Hospital staff");
        System.out.println("Enter your choice: ");
    }

    public static void DisplayMenu3() {
        System.out.println("1. Add.");
        System.out.println("2. Update.");
        System.out.println("3. Delete.");
        System.out.println("4. See all.");
        System.out.println("What do you pick?");
    }

    public static String continueLoop(String answer){
        Scanner scanner = new Scanner(System.in);
        while (!answer.equals("no") && !answer.equals("yes")) {
            System.out.println("\nWant to continue? (yes/ no)\n");
            answer = scanner.nextLine();
            if (answer.equals("no")) {
                System.out.println("Bye.\n");
            } else if (!answer.equals("yes")) {
                System.out.println("Answer not valid. Try again.\n");
            }
        }
        return answer;
    }
}