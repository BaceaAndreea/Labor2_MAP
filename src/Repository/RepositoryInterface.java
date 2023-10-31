package Repository;
import Domain.Arzt;

public interface RepositoryInterface<ObjectType>{
    default void add(ObjectType newObject){

    };

}
abstract class ArztRepo implements RepositoryInterface<Domain.Arzt>{
    public abstract void add(Arzt newObject);
}