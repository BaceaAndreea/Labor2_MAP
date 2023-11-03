package Repository;

import Domain.Doctor;

import java.util.ArrayList;

public class DoctorRepository implements RepositoryInterface<Doctor> {

    private final ArrayList<Doctor> doctors = new ArrayList<Doctor>();

    @Override
    public void add(Doctor newObject) {
        doctors.add(newObject);
    }

    @Override
    public void delete(Doctor deletedObject) {
        doctors.remove(deletedObject);
    }

    @Override
    public void update(Doctor oldObject, Doctor newObject) {
        int index = doctors.indexOf(oldObject);
        if (index != -1) {
            doctors.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Doctor> readAll() {
        return doctors;
    }

    @Override
    public Doctor findByIdentifier(ArrayList<String> identifier){
        for(Doctor doctor : doctors){
            if(doctor.getDoctorID() == Integer.parseInt(identifier.get(0))){
                return doctor;
            }
        }
        return null;
    }

}
