package UI;

import Controller.*;
import Domain.Doctor;
import Domain.Medication;
import Domain.Patient;
import Repository.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Start {

    public static DoctorRepository doctorRepository = new DoctorRepository();
    public static PatientRepository patientRepository = new PatientRepository();
    public static MedicationRepository medicationRepository = new MedicationRepository();
    public static SurgeryRepository surgeryRepository = new SurgeryRepository();
    public static SpecializationRepository specializationRepository = new SpecializationRepository();
    public static DiseaseRepository diseaseRepository = new DiseaseRepository();
    public static ConsultationRepository consultationRepository = new ConsultationRepository();
    public static CabinetRepository cabinetRepository = new CabinetRepository();
    public static HospitalRepository hospitalRepository = new HospitalRepository();
    public static DoctorController doctorController = new DoctorController(doctorRepository);
    public static PatientController patientController = new PatientController(patientRepository);
    public static MedicationController medicationController = new MedicationController(medicationRepository);
    public static SurgeryController surgeryController = new SurgeryController(surgeryRepository);
    public static SpecializationController specializationController = new SpecializationController(specializationRepository);
    public static DiseaseController diseaseController = new DiseaseController(diseaseRepository);
    public static ConsultationController consultationController = new ConsultationController(consultationRepository);
    public static CabinetController cabinetController = new CabinetController(cabinetRepository);
    public static HospitalController hospitalController = new HospitalController(hospitalRepository);



    public static void RUN() {
        Scanner scanner = new Scanner(System.in);
        String answer = "Yes";
        while (answer.equals("Yes")) {
            DisplayMenu2();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    System.out.println("First we want to get to know you: ");
                    break;
                case 2:
                    System.out.println("Which operation do you wish to execute? ");
                    DisplayMenu3();
                    switch (Integer.parseInt(scanner.nextLine())) {
                        case 1:
                            System.out.println("Choose the entity you want to work with.");
                            Menu1();
                            break;
                        case 2:
                            System.out.println("Choose the entity you want to work with.");
                            Menu2();
                            break;
                        case 3:
                            System.out.println("Choose the entity you want to work with.");
                            Menu3();
                            break;
                        case 4:
                            System.out.println("Choose the entity you want to work with.");
                            Menu4();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
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
                System.out.println("Invalid choice.");
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
                System.out.println("Invalid choice.");
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
                System.out.println("Invalid choice.");
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
                System.out.println("Invalid choice.");
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
        while (!answer.equals("No") && !answer.equals("Yes")) {
            System.out.println("Want to continue? (Yes/ No)");
            answer = scanner.nextLine();
            if (answer.equals("No")) {
                System.out.println("Bye.");
            } else if (!answer.equals("Yes")) {
                System.out.println("Answer not valid. Try again.");
            }
        }
        return answer;
    }
}