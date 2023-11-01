package Repository;

import Domain.Medikament;

import java.util.ArrayList;

public class MedikamentRepo implements RepositoryInterface<Medikament> {
    private ArrayList<Medikament> medikamente = new ArrayList<Medikament>();

    @Override
    public void add(Medikament newMedikament) {
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
    public ArrayList<Medikament> readAll() {
        return medikamente;
    }

}
