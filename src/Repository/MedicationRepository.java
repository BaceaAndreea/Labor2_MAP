package Repository;

import Domain.Medication;

import java.util.ArrayList;

public class MedicationRepository implements RepositoryInterface<Medication> {
    private ArrayList<Medication> medication = new ArrayList<Medication>();

    @Override
    public void add(Medication newObject) {
        medication.add(newObject);
    }

    @Override
    public void delete(Medication deletedObject) {
        medication.remove(deletedObject);
    }

    @Override
    public void update(Medication oldObject, Medication newObject) {
        int index = medication.indexOf(oldObject);
        if (index != -1) {
            medication.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Medication> readAll() {
        return medication;
    }
    @Override
    public Medication findByIdentifier(ArrayList<String> identifier){
        for(Medication medication : medication){
            if(medication.getMedicationID() == Integer.parseInt(identifier.get(0))){
                return medication;
            }
        }
        return null;
    }

}