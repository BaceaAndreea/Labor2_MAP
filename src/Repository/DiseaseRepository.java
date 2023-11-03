package Repository;

import Domain.Disease;
import Domain.Medication;

import java.util.ArrayList;

public class DiseaseRepository implements RepositoryInterface<Disease> {
    private ArrayList<Disease> diseases = new ArrayList<>();

    @Override
    public void add(Disease newObject) {
        diseases.add(newObject);
    }

    @Override
    public void delete(Disease deletedObject) {
        diseases.remove(deletedObject);
    }

    @Override
    public void update(Disease oldObject, Disease newObject) {
        int index = diseases.indexOf(oldObject);
        if (index != -1) {
            diseases.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Disease> readAll() {
        return diseases;
    }

    @Override
    public Disease findByIdentifier(ArrayList<String> identifier){
        for(Disease disease : diseases){
            if(disease.getDiseaseID() == Integer.parseInt(identifier.get(0))){
                return disease;
            }
        }
        return null;
    }

}
