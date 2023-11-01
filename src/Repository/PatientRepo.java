package Repository;

import Domain.Patient;

import java.util.ArrayList;

public class PatientRepo implements RepositoryInterface<Patient> {
    private final ArrayList<Patient> patienten = new ArrayList<Patient>();

    @Override
    public void add(Patient newPatient) {
        patienten.add(newPatient);
    }

    @Override
    public void delete(Patient deletedPatient) {
        patienten.remove(deletedPatient);
    }

    @Override
    public void update(Patient oldObject, Patient newObject) {
        int index = patienten.indexOf(oldObject);
        if (index != -1) {
            patienten.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Patient> readAll() {
        return patienten;
    }
}
