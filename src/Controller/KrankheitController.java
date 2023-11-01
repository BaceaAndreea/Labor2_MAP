package Controller;
import Repository.*;
import Domain.*;

import java.util.ArrayList;

public class KrankheitController {
    private final KrankheitRepo krankheitRepo;

    public KrankheitController(KrankheitRepo krankheitRepo){
        this.krankheitRepo = krankheitRepo;
    }

    public void addKrankheit(int krankheitID, String name){
        if(krankheitRepo != null){
            if(krankheitID < 0){
                throw new IllegalArgumentException("KrankheitID is positive.");
            }
            for( Krankheit krankheit : krankheitRepo.readAll()){
                if(krankheit.getKrankheitID() == krankheitID){
                    throw new IllegalArgumentException("KrankheitID is unique.");
                }
            }
        }
        Krankheit newKrankheit = new Krankheit(krankheitID, name);
        krankheitRepo.add(newKrankheit);
    }

    public boolean findKrankheit(int krankheitID){
        for( Krankheit krankheit : krankheitRepo.readAll()) {
            if (krankheit.getKrankheitID() == krankheitID) {
                return true;
            }
        }
        return false;
    }

    public void deleteKrankheit(int krankheitID){
        boolean found = findKrankheit(krankheitID);
        if (found == false) {
            throw new IllegalArgumentException("KrankheitID not found");
        } else{
            for( Krankheit krankheit : krankheitRepo.readAll()) {
                if (krankheit.getKrankheitID() == krankheitID) {
                    krankheitRepo.delete(krankheit);
                    break;
                }
            }
        }
    }

    public void updateKrankheit(int krankheitID, String name){
        boolean found = findKrankheit(krankheitID);
        if (found == false) {
            throw new IllegalArgumentException("KrankheitID not found");
        } else {
            for (Krankheit krankheit : krankheitRepo.readAll()) {
                if (krankheit.getKrankheitID() == krankheitID) {
                    Krankheit newKrankheit = new Krankheit(krankheitID, name);
                    krankheitRepo.update(krankheit, newKrankheit);
                }
            }
        }
    }

    public ArrayList<Krankheit> readAll(){
        return krankheitRepo.readAll();
    }
}
