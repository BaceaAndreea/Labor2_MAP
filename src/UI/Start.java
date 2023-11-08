package UI;

import Controller.*;
import Domain.*;
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

    public static void run() {
        populate();
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
            answer = "-";
            while (!answer.equals("No") && !answer.equals("Yes")) {
                System.out.println("Want to continue? (Yes/ No)");
                answer = scanner.nextLine();
                if (answer.equals("No")) {
                    System.out.println("Bye.");
                } else if (!answer.equals("Yes")) {
                    System.out.println("Answer not valid. Try again.");
                }
            }
        }
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
                break;
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
                break;
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
                for(Doctor doctor : doctorController.readAll()) {
                    System.out.println(doctor+"\n");
                }
                break;
            case 2:
                for(Patient patient : patientController.readAll()) {
                    System.out.println(patient+"\n");
                }
                break;
            case 3:
                for(Medication medication: medicationController.readAll()) {
                    System.out.println(medication+"\n");
                }
                break;
            case 4:
                for(Surgery surgery : surgeryController.readAll()) {
                    System.out.println(surgery+"\n");
                }
                break;
            case 5:
                for(Specialization specialization : specializationController.readAll()) {
                    System.out.println(specialization+"\n");
                }
                break;
            case 6:
                for(Disease disease : diseaseController.readAll()) {
                    System.out.println(disease+"\n");
                }
                break;
            case 7:
                for(Cabinet cabinet: cabinetController.readAll()) {
                    System.out.println(cabinet+"\n");
                }
                break;
            case 8:
                for(Consultation consultation : consultationController.readAll()) {
                    System.out.println(consultation+"\n");
                }
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


    public static void populate(){
        doctorRepository.add(new Doctor(1001, "Smith", "John", "1999-02-20", 5001, "555-9485-4948",2002, 9008));
        doctorRepository.add(new Doctor(1002, "Johnson", "Sarah", "1998-05-15", 5002, "555-3948-5858", 2003, 9009));
        doctorRepository.add(new Doctor(1003, "Williams", "Michael", "1997-09-12", 5003, "555-9394-4848", 2004, 9010));
        doctorRepository.add(new Doctor(1004, "Brown", "Emily", "1996-11-23", 5004, "555-5858-3939", 2005, 9011));
        doctorRepository.add(new Doctor(1005, "Jones", "Daniel", "1995-03-07", 5005, "555-4848-9393", 2006, 9012));
        doctorRepository.add(new Doctor(1006, "Garcia", "Sophia", "1994-07-18", 5006, "555-3838-5858", 2007, 9013));
        doctorRepository.add(new Doctor(1007, "Martinez", "Emma", "1993-12-30", 5007, "555-9393-4848", 2008, 9014));
        doctorRepository.add(new Doctor(1008, "Davis", "James", "1992-08-02", 5008, "555-5858-3838", 2009, 9015));
        doctorRepository.add(new Doctor(1009, "Rodriguez", "Olivia", "1991-10-13", 5009, "555-4848-9393", 2010, 9016));
        doctorRepository.add(new Doctor(1010, "Hernandez", "Noah", "1990-04-25", 5010, "555-3838-5858", 2011, 9017));
        doctorRepository.add(new Doctor(1011, "Lopez", "Liam", "1989-06-06", 5011, "555-9393-4848", 2012, 9018));
        patientRepository.add(new Patient(3001, "German", "Mikayla", "1999-09-11", "555-2342-7655", 4500));
        patientRepository.add(new Patient(3002, "Johnson", "Daniel", "2000-04-05", "555-9087-1234", 4501));
        patientRepository.add(new Patient(3003, "Williams", "Sophia", "1998-12-30", "555-2345-6789", 4502));
        patientRepository.add(new Patient(3004, "Brown", "Noah", "1997-06-15", "555-9876-5432", 4503));
        patientRepository.add(new Patient(3005, "Jones", "Emma", "1996-01-20", "555-1234-5678", 4504));
        patientRepository.add(new Patient(3006, "Garcia", "Liam", "1995-07-25", "555-8765-4321", 4505));
        patientRepository.add(new Patient(3007, "Martinez", "Olivia", "1994-03-10", "555-2345-6789", 4506));
        patientRepository.add(new Patient(3008, "Davis", "Elijah", "1993-08-05", "555-9876-5432", 4507));
        patientRepository.add(new Patient(3009, "Rodriguez", "Ava", "1992-02-15", "555-1234-5678", 4508));
        patientRepository.add(new Patient(3010, "Hernandez", "William", "1991-09-01", "555-8765-4321", 4509));
        patientRepository.add(new Patient(3011, "Lopez", "Isabella", "1990-04-10", "555-2345-6789", 4510));
        specializationRepository.add(new Specialization(2002, "Cardiology"));
        specializationRepository.add(new Specialization(2003, "Pediatrics"));
        specializationRepository.add(new Specialization(2004, "General"));
        specializationRepository.add(new Specialization(2005, "Fetal"));
        specializationRepository.add(new Specialization(2006, "Neo Natal"));
        specializationRepository.add(new Specialization(2007, "Dental"));
        specializationRepository.add(new Specialization(2008, "Dermatology"));
        specializationRepository.add(new Specialization(2009, "Plastics"));
        specializationRepository.add(new Specialization(2010, "Neurology"));
        specializationRepository.add(new Specialization(2011, "Urology"));
        specializationRepository.add(new Specialization(2012, "Oncology"));
        hospitalRepository.add(new Hospital(5001, "Seattle H", 300));
        hospitalRepository.add(new Hospital(5002, "Paris H", 500));
        hospitalRepository.add(new Hospital(5003, "Cluj H", 200));
        hospitalRepository.add(new Hospital(5004, "Berlin H", 2800));
        hospitalRepository.add(new Hospital(5005, "Budapest H", 1000));
        hospitalRepository.add(new Hospital(5006, "Sofia H", 200));
        hospitalRepository.add(new Hospital(5007, "Florence H", 300));
        hospitalRepository.add(new Hospital(5008, "Vienna H", 600));
        hospitalRepository.add(new Hospital(5009, "Hamburg H", 200));
        hospitalRepository.add(new Hospital(5010, "Bonn H", 500));
        hospitalRepository.add(new Hospital(5011, "Johannesburg H", 200));
        cabinetRepository.add(new Cabinet(9008, "1."));
        cabinetRepository.add(new Cabinet(9009, "2."));
        cabinetRepository.add(new Cabinet(9010, "3."));
        cabinetRepository.add(new Cabinet(9011, "4."));
        cabinetRepository.add(new Cabinet(9012, "5."));
        cabinetRepository.add(new Cabinet(9013, "6."));
        cabinetRepository.add(new Cabinet(9014, "7."));
        cabinetRepository.add(new Cabinet(9015, "8."));
        cabinetRepository.add(new Cabinet(9016, "9."));
        cabinetRepository.add(new Cabinet(9017, "10."));
        cabinetRepository.add(new Cabinet(9018, "11."));
        medicationRepository.add(new Medication(6005, "Paracetamol", "Oral", 500, "2025-09-11"));
        medicationRepository.add(new Medication(6006, "Ibuprofen", "Oral", 400, "2025-10-15"));
        medicationRepository.add(new Medication(6007, "Aspirin", "Oral", 300, "2025-11-20"));
        medicationRepository.add(new Medication(6008, "Amoxicillin", "Oral", 250, "2025-12-25"));
        medicationRepository.add(new Medication(6009, "Diazepam", "Oral", 350, "2026-01-30"));
        medicationRepository.add(new Medication(6010, "Lisinopril", "Oral", 200, "2026-02-04"));
        medicationRepository.add(new Medication(6011, "Simvastatin", "Oral", 150, "2026-03-10"));
        medicationRepository.add(new Medication(6012, "Loratadine", "Oral", 100, "2026-04-15"));
        medicationRepository.add(new Medication(6013, "Metformin", "Oral", 300, "2026-05-20"));
        medicationRepository.add(new Medication(6014, "Atorvastatin", "Oral", 250, "2026-06-25"));
        medicationRepository.add(new Medication(6015, "Prednisone", "Oral", 200, "2026-07-30"));
        diseaseRepository.add(new Disease(7002, "Eczema"));
        diseaseRepository.add(new Disease(7003, "Asthma"));
        diseaseRepository.add(new Disease(7004, "Diabetes"));
        diseaseRepository.add(new Disease(7005, "Arthritis"));
        diseaseRepository.add(new Disease(7006, "Hypertension"));
        diseaseRepository.add(new Disease(7007, "Depression"));
        diseaseRepository.add(new Disease(7008, "Migraine"));
        diseaseRepository.add(new Disease(7009, "Osteoporosis"));
        diseaseRepository.add(new Disease(7010, "Bronchitis"));
        diseaseRepository.add(new Disease(7011, "Gastritis"));
        diseaseRepository.add(new Disease(7012, "Anemia"));

    }
}