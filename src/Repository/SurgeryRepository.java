package Repository;

import Domain.Surgery;

import java.util.ArrayList;

public class SurgeryRepository implements RepositoryInterface<Surgery> {
    private final ArrayList<Surgery> surgeries = new ArrayList<Surgery>();

    @Override
    public void add(Surgery newObject) {
        surgeries.add(newObject);
    }

    @Override
    public void delete(Surgery deletedObject) {
        surgeries.remove(deletedObject);
    }

    @Override
    public void update(Surgery oldObject, Surgery newObject) {
        int index = surgeries.indexOf(oldObject);
        if (index != -1) {
            surgeries.set(index, newObject);
        }
    }
    @Override
    public ArrayList<Surgery> readAll() {
        return surgeries;
    }

    @Override
    public Surgery findByIdentifier(ArrayList<String> identifier){
        for(Surgery surgery : surgeries){
            if(surgery.getPatientID() == Integer.parseInt(identifier.get(0)) && surgery.getDoctorID() == Integer.parseInt(identifier.get(1)) && surgery.getDate().equals(identifier.get(2))){
                return surgery;
            }
        }
        return null;
    }
}
