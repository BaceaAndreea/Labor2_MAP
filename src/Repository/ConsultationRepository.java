package Repository;

import Domain.Consultation;

import java.util.ArrayList;

public class ConsultationRepository implements RepositoryInterface<Consultation> {
    private final ArrayList<Consultation> consultations = new ArrayList<Consultation>();

    @Override
    public void add(Consultation newObject) {
        consultations.add(newObject);
    }

    @Override
    public void delete(Consultation deletedObject) {
        consultations.remove(deletedObject);
    }

    @Override
    public void update(Consultation oldObject, Consultation newObject) {
        int index = consultations.indexOf(oldObject);
        if (index != -1) {
            consultations.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Consultation> readAll() {
        return consultations;
    }

    @Override
    public Consultation findByIdentifier(ArrayList<String> identifier){
        for(Consultation consultation : consultations){
            if(consultation.getPatientID() == Integer.parseInt(identifier.get(0)) && consultation.getDoctorID() == Integer.parseInt(identifier.get(1)) && consultation.getDate().equals(identifier.get(2))){
                return consultation;
            }
        }
        return null;
    }


}