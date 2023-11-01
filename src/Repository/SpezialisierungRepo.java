package Repository;

import Domain.Spezialisierung;

import java.util.ArrayList;

public class SpezialisierungRepo implements RepositoryInterface<Spezialisierung> {
    private ArrayList<Spezialisierung> spezialisierungen = new ArrayList<Spezialisierung>();

    @Override
    public void add(Spezialisierung newSpezialisierung) {
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
    public ArrayList<Spezialisierung> readAll() {
        return spezialisierungen;
    }

}
