package Controller;
import Repository.*;
import Domain.*;

import java.util.ArrayList;

public class PatientController {
    private final PatientRepo patientRepo;

    public PatientController(PatientRepo patientRepo){
        this.patientRepo = patientRepo;
    }

    public void addPatient(int patientID, String name, String vorname, String geburtsdatum, String kontakttelefon, int karteID){
        if(patientRepo != null) {
            if (patientID < 0) {
                throw new IllegalArgumentException("PatientID is positive.");
            }
            for (Patient patient : patientRepo.readAll()) {
                if (patient.getPatientID() == patientID) {
                    throw new IllegalArgumentException("PatientID is unique.");
                }
            }
        }
        Patient newPatient = new Patient(patientID, name, vorname, geburtsdatum, kontakttelefon, karteID);
        patientRepo.add(newPatient);
    }
    public boolean findPatient(int patientID){
        for(Patient patient : patientRepo.readAll()){
            if(patient.getPatientID() == patientID) {
                return true;
            }
        }
        return false;
    }

    public void deletePateint(int patientID){
        boolean found = findPatient(patientID);
        if (found == false) {
            throw new IllegalArgumentException("PatientID not found");
        } else{
            for(Patient patient : patientRepo.readAll()){
                if(patient.getPatientID() == patientID){
                    patientRepo.delete(patient);
                    break;
                }
            }
        }
    }

    public void updatePateint(int patientID, String name, String vorname, String geburtsdatum, String kontakttelefon, int karteID) {
        boolean found = findPatient(patientID);
        if (found == false) {
            throw new IllegalArgumentException("PatientID not found");
        } else {
            for (Patient patient : patientRepo.readAll()) {
                if (patient.getPatientID() == patientID) {
                    Patient newPatient = new Patient(patientID, name, vorname, geburtsdatum, kontakttelefon, karteID);
                    patientRepo.update(patient, newPatient);
                }
            }
        }
    }

    public ArrayList<Patient> readAll(){
        return patientRepo.readAll();
    }
}
