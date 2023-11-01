package Repository;

import Domain.Kabinett;

import java.util.ArrayList;

class KabinettRepo implements RepositoryInterface<Kabinett> {
    private ArrayList<Kabinett> kabinette = new ArrayList<>();

    @Override
    public void add(Kabinett newKabinett) {
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
    public ArrayList<Kabinett> readAll() {
        return kabinette;
    }

}
