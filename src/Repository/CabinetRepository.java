package Repository;

import Domain.Cabinet;

import java.util.ArrayList;

public class CabinetRepository implements RepositoryInterface<Cabinet> {
    private ArrayList<Cabinet> cabinets = new ArrayList<Cabinet>();

    @Override
    public void add(Cabinet newObject) {
        cabinets.add(newObject);
    }

    @Override
    public void delete(Cabinet deletedObject) {
        cabinets.remove(deletedObject);
    }

    @Override
    public void update(Cabinet oldObject, Cabinet newObject) {
        int index = cabinets.indexOf(oldObject);
        if (index != -1) {
            cabinets.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Cabinet> readAll() {
        return cabinets;
    }

    @Override
    public Cabinet findByIdentifier(ArrayList<String> identifier){
        for(Cabinet cabinet : cabinets){
            if(cabinet.getCabinetID() == Integer.parseInt(identifier.get(0))){
                return cabinet;
            }
        }
        return null;
    }

}