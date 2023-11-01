package Repository;

import Domain.Arzt;

import java.util.ArrayList;

public class ArztRepo implements RepositoryInterface<Arzt> {

    private final ArrayList<Arzt> arzte = new ArrayList<Arzt>();

    @Override
    public void add(Arzt newArzt) {
        arzte.add(newArzt);
    }

    @Override
    public void delete(Arzt deletedArzt) {
        arzte.remove(deletedArzt);
    }

    @Override
    public void update(Arzt oldObject, Arzt newObject) {
        int index = arzte.indexOf(oldObject);
        if (index != -1) {
            arzte.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Arzt> readAll() {
        return arzte;
    }

}
