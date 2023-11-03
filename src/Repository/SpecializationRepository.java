package Repository;

import Domain.Specialization;

import java.util.ArrayList;

public class SpecializationRepository implements RepositoryInterface<Specialization> {
    private ArrayList<Specialization> specializations = new ArrayList<Specialization>();

    @Override
    public void add(Specialization newObject) {
        specializations.add(newObject);
    }

    @Override
    public void delete(Specialization deletedObject) {
        specializations.remove(deletedObject);
    }

    @Override
    public void update(Specialization oldObject, Specialization newObject) {
        int index = specializations.indexOf(oldObject);
        if (index != -1) {
            specializations.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Specialization> readAll() {
        return specializations;
    }

    @Override
    public Specialization findByIdentifier(ArrayList<String> identifier){
        for(Specialization specialization : specializations){
            if(specialization.getSpecializationID() == Integer.parseInt(identifier.get(0))){
                return specialization;
            }
        }
        return null;
    }

}