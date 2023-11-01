package Repository;

import Domain.Krankenhaus;

import java.util.ArrayList;

class KrankenhausRepo implements RepositoryInterface<Krankenhaus> {
    private ArrayList<Krankenhaus> krankenhauser = new ArrayList<>();

    @Override
    public void add(Krankenhaus newKrankenhaus) {
        krankenhauser.add(newKrankenhaus);
    }

    @Override
    public void delete(Krankenhaus deletedKrankenhaus) {
        krankenhauser.remove(deletedKrankenhaus);
    }

    @Override
    public void update(Krankenhaus oldObject, Krankenhaus newObject) {
        int index = krankenhauser.indexOf(oldObject);
        if (index != -1) {
            krankenhauser.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Krankenhaus> readAll() {
        return krankenhauser;
    }

}
