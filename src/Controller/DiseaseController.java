package Controller;

import Domain.Disease;
import Repository.DiseaseRepository;
import java.util.ArrayList;

public class DiseaseController implements ControllerInterface<Disease> {
    private final DiseaseRepository diseaseRepository;
    public DiseaseController(DiseaseRepository diseaseRepository) {
        this.diseaseRepository = diseaseRepository;
    }
    @Override
    public void add(ArrayList<String> newObjectData){
        /*if(diseaseRepository != null) {
            if (diseaseID < 0) {
                throw new IllegalArgumentException("DiseaseID is positive.");
            }
            for (Disease disease :diseaseRepo.readAll()) {
                if (disease.getDiseaseID() == diseaseID) {
                    throw new IllegalArgumentException("DiseaseID is unique.");
                }
            }
        }*/
        Disease newObject= new Disease(Integer.parseInt(newObjectData.get(0)), newObjectData.get(1));
        diseaseRepository.add(newObject);
    }

    @Override
    public void delete(ArrayList<String> identifier) {
        if(diseaseRepository.findByIdentifier(identifier) != null) {
            diseaseRepository.delete(diseaseRepository.findByIdentifier(identifier));
        }
        else {
            throw new IllegalArgumentException("Nothing was found for the provided identifier.");
        }
    }

    @Override
    public void update(ArrayList<String> identifier, ArrayList<String> newObjectData) {
        if(diseaseRepository.findByIdentifier(identifier) != null) {
            delete(identifier);
            add(newObjectData);
        }
        else{
            throw new IllegalArgumentException("Nothing was found for the provided identifier.");
        }
    }

    @Override
    public ArrayList<Disease> readAll(){
        return diseaseRepository.readAll();
    }
}