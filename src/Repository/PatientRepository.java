package Repository;

import Domain.Patient;

import java.util.ArrayList;

public class PatientRepository implements RepositoryInterface<Patient> {
    private final ArrayList<Patient> patients = new ArrayList<Patient>();

    @Override
    public void add(Patient newObject) {
        patients.add(newObject);
    }

    @Override
    public void delete(Patient deletedObject) {
        patients.remove(deletedObject);
    }

    @Override
    public void update(Patient oldObject, Patient newObject) {
        int index = patients.indexOf(oldObject);
        if (index != -1) {
            patients.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Patient> readAll() {
        return patients;
    }

    @Override
    public Patient findByIdentifier(ArrayList<String> identifier){
        for(Patient patient : patients){
            if(patient.getPatientID() == Integer.parseInt(identifier.get(0))){
                return patient;
            }
        }
        return null;
    }
}