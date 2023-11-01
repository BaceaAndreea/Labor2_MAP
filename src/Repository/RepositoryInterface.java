package Repository;
import Domain.Arzt;

public interface RepositoryInterface<ObjectType>{
    void add(ObjectType newObject);
    void delete(ObjectType deletedObject);
    void update(ObjectType oldObject, ObjectType newObject);
    ArrayList<ObjectType> readAll();

}

class ArztRepo implements RepositoryInterface<Arzt>{
    private ArrayList<Arzt> arzte = new ArrayList<>();

    @Override
    public void add(Arzt newArzt){
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
    public ArrayList<Arzt> readAll(){
        return arzte;
    }

}