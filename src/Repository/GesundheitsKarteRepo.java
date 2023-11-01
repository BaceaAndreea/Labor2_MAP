package Repository;

import Domain.GesundheitsKarte;

import java.util.ArrayList;

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
