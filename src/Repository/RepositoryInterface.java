package Repository;
import Domain.*;

import java.util.ArrayList;

public interface RepositoryInterface<ObjectType>{
    void add(ObjectType newObject);
    void delete(ObjectType deletedObject);
    void update(ObjectType oldObject, ObjectType newObject);
    ArrayList<ObjectType> readAll();

}

class PatientRepo implements RepositoryInterface<Patient> {
    private ArrayList<Patient> patienten = new ArrayList<>();

    public PatientRepo(){
        patienten =new ArrayList<>();
    }

    @Override
    public void add(Patient newPatient) {
        patienten.add(newPatient);
    }

    @Override
    public void delete(Patient deletedPatient) {
        patienten.remove(deletedPatient);
    }

    @Override
    public void update(Patient oldObject, Patient newObject) {
        int index = patienten.indexOf(oldObject);
        if (index != -1) {
            patienten.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Patient> readAll() {
        return patienten;
    }
}


class MedikamentRepo implements RepositoryInterface<Medikament>{
    private ArrayList<Medikament> medikamente = new ArrayList<>();

    @Override
    public void add(Medikament newMedikament){
        medikamente.add(newMedikament);
    }

    @Override
    public void delete(Medikament deletedMedikament) {
        medikamente.remove(deletedMedikament);
    }

    @Override
    public void update(Medikament oldObject, Medikament newObject) {
        int index = medikamente.indexOf(oldObject);
        if (index != -1) {
            medikamente.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Medikament> readAll(){
        return medikamente;
    }

}

class SpezialisierungRepo implements RepositoryInterface<Spezialisierung>{
    private ArrayList<Spezialisierung> spezialisierungen = new ArrayList<>();

    @Override
    public void add(Spezialisierung newSpezialisierung){
        spezialisierungen.add(newSpezialisierung);
    }


    @Override
    public void delete(Spezialisierung deletedSpezialisierung) {
        spezialisierungen.remove(deletedSpezialisierung);
    }

    @Override
    public void update(Spezialisierung oldObject, Spezialisierung newObject) {
        int index = spezialisierungen.indexOf(oldObject);
        if (index != -1) {
            spezialisierungen.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Spezialisierung> readAll(){
        return spezialisierungen;
    }

}

class OperationRepo implements RepositoryInterface<Operation>{
    private ArrayList<Operation> operationen = new ArrayList<>();

    @Override
    public void add(Operation newOperation){
        operationen.add(newOperation);
    }

    @Override
    public void delete(Operation deletedOpertationen) {
        operationen.remove(deletedOpertationen);
    }

    @Override
    public void update(Operation oldObject, Operation newObject) {
        int index = operationen.indexOf(oldObject);
        if (index != -1) {
            operationen.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Operation> readAll(){
        return operationen;
    }
}


class BeratungRepo implements RepositoryInterface<Beratung>{
    private ArrayList<Beratung> beratungen = new ArrayList<>();

    @Override
    public void add(Beratung newBeratung){
        beratungen.add(newBeratung);
    }

    @Override
    public void delete(Beratung deletedBeratung) {
        beratungen.remove(deletedBeratung);
    }

    @Override
    public void update(Beratung oldObject, Beratung newObject) {
        int index = beratungen.indexOf(oldObject);
        if (index != -1) {
            beratungen.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Beratung> readAll(){
        return beratungen;
    }

}

class KabinettRepo implements RepositoryInterface<Kabinett>{
    private ArrayList<Kabinett> kabinette = new ArrayList<>();

    @Override
    public void add(Kabinett newKabinett){
        kabinette.add(newKabinett);
    }

    @Override
    public void delete(Kabinett deletedKabinett) {
        kabinette.remove(deletedKabinett);
    }

    @Override
    public void update(Kabinett oldObject, Kabinett newObject) {
        int index = kabinette.indexOf(oldObject);
        if (index != -1) {
            kabinette.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Kabinett> readAll(){
        return kabinette;
    }

}

class KrankenhausRepo implements RepositoryInterface<Krankenhaus>{
    private ArrayList<Krankenhaus> krankenhauser = new ArrayList<>();

    @Override
    public void add(Krankenhaus newKrankenhaus){
        krankenhauser.add(newKrankenhaus);
    }

    @Override
    public void delete(Krankenhaus deletedKrankenhaus) {
        krankenhauser.remove(deletedKrankenhaus );
    }

    @Override
    public void update(Krankenhaus oldObject, Krankenhaus newObject) {
        int index = krankenhauser.indexOf(oldObject);
        if (index != -1) {
            krankenhauser.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Krankenhaus> readAll(){
        return krankenhauser;
    }

}


class KrankheitRepo implements RepositoryInterface<Krankheit>{
    private ArrayList<Krankheit> krankenheiten = new ArrayList<>();

    @Override
    public void add(Krankheit newKrankenheit){
        krankenheiten.add(newKrankenheit);
    }

    @Override
    public void delete(Krankheit deletedKrankenheit) {
        krankenheiten.remove(deletedKrankenheit);
    }

    @Override
    public void update(Krankheit oldObject, Krankheit newObject) {
        int index = krankenheiten.indexOf(oldObject);
        if (index != -1) {
            krankenheiten.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Krankheit> readAll(){
        return krankenheiten;
    }

}

class GesundheitsKarteRepo implements RepositoryInterface<GesundheitsKarte> {
    private ArrayList<GesundheitsKarte> gesundheitsKarten = new ArrayList<>();

    @Override
    public void add(GesundheitsKarte newGesundheitskarte) {
        gesundheitsKarten.add(newGesundheitskarte);
    }

    @Override
    public void delete(GesundheitsKarte deletedGesundheitskarte) {
        gesundheitsKarten.remove(deletedGesundheitskarte);
    }

    @Override
    public void update(GesundheitsKarte oldObject, GesundheitsKarte newObject) {
        int index = gesundheitsKarten.indexOf(oldObject);
        if (index != -1) {
            gesundheitsKarten.set(index, newObject);
        }
    }

    @Override
    public ArrayList<GesundheitsKarte> readAll() {
        return gesundheitsKarten;
    }
}

class ElectronischeKarteRepo implements RepositoryInterface<ElectronischeKarte> {
    private ArrayList<ElectronischeKarte> electronischeKarten = new ArrayList<>();

    @Override
    public void add(ElectronischeKarte newElectronischekarte) {
        electronischeKarten.add(newElectronischekarte);
    }

    @Override
    public void delete(ElectronischeKarte deletedelEctronischekarte) {
        electronischeKarten.remove(deletedelEctronischekarte);
    }

    @Override
    public void update(ElectronischeKarte oldObject, ElectronischeKarte newObject) {
        int index = electronischeKarten.indexOf(oldObject);
        if (index != -1) {
            electronischeKarten.set(index, newObject);
        }
    }
    
    @Override
    public ArrayList<ElectronischeKarte> readAll() {
        return electronischeKarten;
    }
}


