package Controller;
import Repository.*;
import Domain.*;

import java.util.ArrayList;

public class MedikamenteController {
    private final MedikamentRepo medikamenteRepo;

    public MedikamenteController(MedikamentRepo medikamenteRepo) {
        this.medikamenteRepo = medikamenteRepo;
    }

    public void addMedikament(int medikamentID, String name, String verabreichungsweg, int mengeLager, String verfallsdatum){
        if(medikamenteRepo != null){
            if(medikamentID < 0){
                throw new IllegalArgumentException("MedikamentID is positive.");
            }
            for(Medikament medikament : medikamenteRepo.readAll()){
                if(medikament.getMedikamentID() == medikamentID){
                    throw new IllegalArgumentException("MedikamentID is unique.");
                }
            }
        }
        Medikament newMedikament = new Medikament(medikamentID, name, verabreichungsweg, mengeLager, verfallsdatum);
        medikamenteRepo.add(newMedikament);
    }

    public boolean findMedikament(int medikamentID){
        for(Medikament medikament : medikamenteRepo.readAll()){
            if(medikament.getMedikamentID() == medikamentID){
                return true;
            }
        }
        return false;
    }

    public void deleteMedikament(int medikamentID){
        boolean found = findMedikament(medikamentID);
        if(found == false){
            throw new IllegalArgumentException("MedikamentID not found");
        } else{
            for(Medikament medikament : medikamenteRepo.readAll()){
                if(medikament.getMedikamentID() == medikamentID){
                    medikamenteRepo.delete(medikament);
                    break;
                }
            }
        }
    }

    public void updateMedikament(int medikamentID, String name, String verabreichungsweg, int mengeLager, String verfallsdatum){
        boolean found = findMedikament(medikamentID);
        if(found == false){
            throw new IllegalArgumentException("MedikamentID not found");
        } else{
            for(Medikament medikament : medikamenteRepo.readAll()){
                if(medikament.getMedikamentID() == medikamentID){
                    Medikament newMedikament = new Medikament(medikamentID, name, verabreichungsweg, mengeLager, verfallsdatum);
                    medikamenteRepo.update(medikament, newMedikament);
                }
            }
        }
    }

    public ArrayList<Medikament> readall(){
        return medikamenteRepo.readAll();
    }


}
