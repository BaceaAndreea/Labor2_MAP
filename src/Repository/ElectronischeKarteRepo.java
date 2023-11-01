package Repository;

import Domain.ElectronischeKarte;

import java.util.ArrayList;

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
