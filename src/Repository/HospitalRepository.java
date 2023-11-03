package Repository;

import Domain.Hospital;

import java.util.ArrayList;

public class HospitalRepository implements RepositoryInterface<Hospital> {
    private ArrayList<Hospital> hospitals = new ArrayList<>();

    @Override
    public void add(Hospital newObject) {
        hospitals.add(newObject);
    }

    @Override
    public void delete(Hospital deletedObject) {
        hospitals.remove(deletedObject);
    }

    @Override
    public void update(Hospital oldObject, Hospital newObject) {
        int index = hospitals.indexOf(oldObject);
        if (index != -1) {
            hospitals.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Hospital> readAll() {
        return hospitals;
    }

    @Override
    public Hospital findByIdentifier(ArrayList<String> identifier){
        for(Hospital hospital : hospitals){
            if(hospital.getHospitalID() == Integer.parseInt(identifier.get(0))){
                return hospital;
            }
        }
        return null;
    }

}

