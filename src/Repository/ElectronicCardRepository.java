package Repository;

import Domain.ElectronicCard;
import Domain.Medication;

import java.util.ArrayList;

class ElectronicCardRepository implements RepositoryInterface<ElectronicCard> {
    private ArrayList<ElectronicCard> electronicCards = new ArrayList<>();

    @Override
    public void add(ElectronicCard newObject) {
        electronicCards.add(newObject);
    }

    @Override
    public void delete(ElectronicCard deletedObject) {
        electronicCards.remove(deletedObject);
    }

    @Override
    public void update(ElectronicCard oldObject, ElectronicCard newObject) {
        int index = electronicCards.indexOf(oldObject);
        if (index != -1) {
            electronicCards.set(index, newObject);
        }
    }

    @Override
    public ArrayList<ElectronicCard> readAll() {
        return electronicCards;
    }

    @Override
    public ElectronicCard findByIdentifier(ArrayList<String> identifier){
        for(ElectronicCard electronicCard : electronicCards){
            if(electronicCard.getPin() == Integer.parseInt(identifier.get(0))){
                return electronicCard;
            }
        }
        return null;
    }
}
