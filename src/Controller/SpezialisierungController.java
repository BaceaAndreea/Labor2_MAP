package Controller;
import Repository.*;
import Domain.*;

import java.util.ArrayList;


public class SpezialisierungController {
    private final SpezialisierungRepo spezialisierungRepo;

    public SpezialisierungController(SpezialisierungRepo spezialisierungRepo){
        this.spezialisierungRepo = spezialisierungRepo;
    }

    public void addSpezialisierung(int spezialisierungsID, String name){
        if(spezialisierungRepo != null){
            if(spezialisierungsID < 0){
                throw new IllegalArgumentException("SpezialisierungID is positive.");
            }
            for(Spezialisierung spezialisierung : spezialisierungRepo.readAll()){
                if(spezialisierung.getSpezialisierungsID() == spezialisierungsID){
                    throw new IllegalArgumentException("PatientID is unique.");
                }
            }
        }
        Spezialisierung newspezialisierung = new Spezialisierung(spezialisierungsID, name);
        spezialisierungRepo.add(newspezialisierung);
    }

    public boolean findSpezialisierung(int spezialisierungID){
        for(Spezialisierung spezialisierung : spezialisierungRepo.readAll()){
            if(spezialisierung.getSpezialisierungsID() == spezialisierungID){
                return true;
            }
        }
        return false;
    }

    public void deleteSpezialisierung(int spezialisierungID){
        boolean found = findSpezialisierung(spezialisierungID);
        if (found == false) {
            throw new IllegalArgumentException("SpezialisierungID not found");
        } else{
            for(Spezialisierung spezialisierung : spezialisierungRepo.readAll()){
                if(spezialisierung.getSpezialisierungsID() == spezialisierungID) {
                    spezialisierungRepo.delete(spezialisierung);
                    break;
                }
            }
        }
    }

    public void updateSpezialiserung(int spezialisierungsID, String name){
        boolean found = findSpezialisierung(spezialisierungsID);
        if (found == false) {
            throw new IllegalArgumentException("SpezialisierungID not found");
        } else{
            for(Spezialisierung spezialisierung : spezialisierungRepo.readAll()){
                if(spezialisierung.getSpezialisierungsID() == spezialisierungsID) {
                    Spezialisierung newspezialisierung = new Spezialisierung(spezialisierungsID, name);
                    spezialisierungRepo.update(spezialisierung, newspezialisierung);
                }
            }
        }
    }

    public ArrayList<Spezialisierung> readAll(){
        return spezialisierungRepo.readAll();
    }

}
