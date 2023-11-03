package Controller;

import Domain.Cabinet;
import Repository.CabinetRepository;
import java.util.ArrayList;

public class CabinetController implements ControllerInterface<Cabinet> {
    private final CabinetRepository cabinetRepository;
    public CabinetController(CabinetRepository cabinetRepository) {
        this.cabinetRepository = cabinetRepository;
    }
    @Override
    public void add(ArrayList<String> newObjectData){
        /*if(cabinetRepository != null) {
            if (cabinetID < 0) {
                throw new IllegalArgumentException("CabinetID is positive.");
            }
            for (Cabinet cabinet :cabinetRepo.readAll()) {
                if (cabinet.getCabinetID() == cabinetID) {
                    throw new IllegalArgumentException("CabinetID is unique.");
                }
            }
        }*/
        Cabinet newObject= new Cabinet(Integer.parseInt(newObjectData.get(0)), newObjectData.get(1));
        cabinetRepository.add(newObject);
    }

    @Override
    public void delete(ArrayList<String> identifier) {
        if(cabinetRepository.findByIdentifier(identifier) != null) {
            cabinetRepository.delete(cabinetRepository.findByIdentifier(identifier));
        }
        else {
            throw new IllegalArgumentException("Nothing was found for the provided identifier.");
        }
    }

    @Override
    public void update(ArrayList<String> identifier, ArrayList<String> newObjectData) {
        if(cabinetRepository.findByIdentifier(identifier) != null) {
            delete(identifier);
            add(newObjectData);
        }
        else{
            throw new IllegalArgumentException("Nothing was found for the provided identifier.");
        }
    }

    @Override
    public ArrayList<Cabinet> readAll(){
        return cabinetRepository.readAll();
    }
}