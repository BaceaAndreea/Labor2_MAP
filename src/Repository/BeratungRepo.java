package Repository;

import Domain.Beratung;

import java.util.ArrayList;

class BeratungRepo implements RepositoryInterface<Beratung> {
    private ArrayList<Beratung> beratungen = new ArrayList<>();

    @Override
    public void add(Beratung newBeratung) {
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
    public ArrayList<Beratung> readAll() {
        return beratungen;
    }

}
