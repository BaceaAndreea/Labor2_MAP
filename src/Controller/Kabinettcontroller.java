package Controller;
import Repository.*;
import Domain.*;

import java.util.ArrayList;


public class Kabinettcontroller {
    private final KabinettRepo kabinettRepo;

    public Kabinettcontroller(KabinettRepo kabinettRepo){
        this.kabinettRepo = kabinettRepo;
    }

    public void addKabinette(int kabinettID, String name){
        if(kabinettRepo != null){
            if(kabinettID < 0){
                throw new IllegalArgumentException("KabinettID is positive.");
            }
            for(Kabinett kabinett : kabinettRepo.readAll()){
                if(kabinett.getKabinettID() == kabinettID){
                    throw new IllegalArgumentException("KabinetID is unique.");
                }
            }
        }
        Kabinett newKabinett = new Kabinett(kabinettID, name);
        kabinettRepo.add(newKabinett);
    }

    public boolean findKabinett(int kabinettID){
        for(Kabinett kabinett : kabinettRepo.readAll()) {
            if (kabinett.getKabinettID() == kabinettID) {
                return true;
            }
        }
        return false;
    }

    public void deleteKabinett(int kabinettID){
        boolean found = findKabinett(kabinettID);
        if (found == false){
            throw new IllegalArgumentException("KabinettID not found");
        } else {
            for (Kabinett kabinett : kabinettRepo.readAll()) {
                if (kabinett.getKabinettID() == kabinettID) {
                    kabinettRepo.delete(kabinett);
                    break;
                }
            }
        }
    }

    public void updateKabinette(int kabinettID, String name){
        boolean found = findKabinett(kabinettID);
        if (found == false){
            throw new IllegalArgumentException("KabinettID not found");
        } else {
            for (Kabinett kabinett : kabinettRepo.readAll()) {
                if (kabinett.getKabinettID() == kabinettID) {
                    Kabinett newKabinett = new Kabinett(kabinettID, name);
                    kabinettRepo.update(kabinett, newKabinett);
                }
            }
        }
    }

    public ArrayList<Kabinett> readAll(){
        return kabinettRepo.readAll();
    }




}
