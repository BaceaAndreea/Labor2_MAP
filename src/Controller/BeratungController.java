package Controller;
import Repository.*;
import Domain.*;

import java.util.ArrayList;
import java.util.Date;

public class BeratungController {
    private final BeratungRepo beratungRepo;

    public BeratungController(BeratungRepo beratungRepo) {
        this.beratungRepo = beratungRepo;
    }

    public void addBeratung(int patientID, int arztID, String datum, int krankenheitid, boolean karte, int preis){
        if(beratungRepo != null) {
            if (arztID < 0 || patientID < 0) {
                throw new IllegalArgumentException("ArztID and PatientID are positive.");
            }
            for (Beratung beratung : beratungRepo.readAll()) {
                if (beratung.getArztID() == arztID && beratung.getPatientID() == patientID && beratung.getDatum().equals(datum)) {
                    throw new IllegalArgumentException("Combination ArztID + PatientID + Date is unique for operation.");
                }
            }
        }
        Beratung newBeratung = new Beratung(patientID, arztID, datum, krankenheitid, karte, preis);
        beratungRepo.add(newBeratung);
    }
    public boolean findBeratung(int arztID, int patientID, String datum){
        for(Beratung beratung : beratungRepo.readAll()){
            if(beratung.getArztID() == arztID && beratung.getPatientID() == patientID && beratung.getDatum().equals(datum) ) {
                return true;
            }
        }
        return false;
    }
    public void deleteBeratung(int arztID, int patientID, String datum) {
        boolean found = findBeratung(arztID, patientID, datum);
        if (!found) {
            throw new IllegalArgumentException("Combination ArztID + PatientID + Date not found");
        } else {
            for (Beratung beratung: beratungRepo.readAll()) {
                if (beratung.getArztID() == arztID && beratung.getPatientID() == patientID && beratung.getDatum().equals(datum) ) {
                    beratungRepo.delete(beratung);
                    break;
                }

            }
        }
    }

    public void updateBeratung(int patientID, int arztID, String datum, int krankenheitid, boolean karte, int preis) {
        boolean found = findBeratung(arztID, patientID, datum);
        if (found == false) {
            throw new IllegalArgumentException("ArztID not found");
        } else {
            for (Beratung beratung : beratungRepo.readAll()) {
                if (beratung.getArztID() == arztID && beratung.getPatientID() == patientID && beratung.getDatum().equals(datum) ) {
                    Beratung newBeratung = new Beratung(patientID, arztID, datum, krankenheitid, karte, preis);
                    beratungRepo.update(beratung, newBeratung);
                }
            }
        }
    }

    public ArrayList<Beratung> readAll(){
        return beratungRepo.readAll();
    }
}
