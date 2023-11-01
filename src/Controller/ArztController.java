package Controller;
import Repository.*;
import Domain.*;

import java.util.ArrayList;

public class ArztController {
    private final ArztRepo arztRepo;

    public ArztController(ArztRepo arztRepo) {
        this.arztRepo = arztRepo;
    }

    public void addArzt(int arztID, String name, String vorname, String geburstdatum, int krankenhausID, String kontakttelefon, int spezialisierungID, int kabinettID){
        if(arztRepo != null) {
            if (arztID < 0) {
                throw new IllegalArgumentException("ArztID is positive.");
            }
            for (Arzt arzt : arztRepo.readAll()) {
                if (arzt.getArztID() == arztID) {
                    throw new IllegalArgumentException("ArztID is unique.");
                }
            }
        }
        Arzt newArzt= new Arzt(arztID, name, vorname, geburstdatum, krankenhausID, kontakttelefon, spezialisierungID, kabinettID);
        arztRepo.add(newArzt);
    }
    public boolean findArzt(int arztID){
        for(Arzt arzt : arztRepo.readAll()){
            if(arzt.getArztID() == arztID) {
                return true;
            }
        }
        return false;
    }
    public void deleteArzt(int arztID) {
        boolean found = findArzt(arztID);
        if (found == false) {
            throw new IllegalArgumentException("ArztID not found");
        } else {
            for (Arzt arzt : arztRepo.readAll()) {
                if (arzt.getArztID() == arztID) {
                    arztRepo.delete(arzt);
                    break;
                }

            }
        }
    }

    public void updateArzt(int arztID, String name, String vorname, String geburstdatum, int krankenhausID, String kontakttelefon, int spezialisierungID, int kabinettID) {
        boolean found = findArzt(arztID);
        if (found == false) {
            throw new IllegalArgumentException("ArztID not found");
        } else {
            for (Arzt arzt : arztRepo.readAll()) {
                if (arzt.getArztID() == arztID) {
                    Arzt newArzt = new Arzt(arztID, name, vorname, geburstdatum, krankenhausID, kontakttelefon, spezialisierungID, kabinettID);
                    arztRepo.update(arzt, newArzt);
                }
            }
        }
    }

    public ArrayList<Arzt> readAll(){
        return arztRepo.readAll();
    }
}
