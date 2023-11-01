package Repository;

import Domain.Krankheit;
import Domain.Medikament;

import java.util.ArrayList;

public class KrankheitRepo implements RepositoryInterface<Krankheit> {
    private ArrayList<Krankheit> krankenheiten = new ArrayList<>();

    @Override
    public void add(Krankheit newKrankenheit) {
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
    public ArrayList<Krankheit> readAll() {
        return krankenheiten;
    }

}
