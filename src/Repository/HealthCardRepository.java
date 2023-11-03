package Repository;

import Domain.HealthCard;
import Domain.Medication;

import java.util.ArrayList;

class HealthCardRepository implements RepositoryInterface<HealthCard> {
    private ArrayList<HealthCard> healthCards = new ArrayList<>();

    @Override
    public void add(HealthCard newObject) {
        healthCards.add(newObject);
    }

    @Override
    public void delete(HealthCard deletedObject) {
        healthCards.remove(deletedObject);
    }

    @Override
    public void update(HealthCard oldObject, HealthCard newObject) {
        int index = healthCards.indexOf(oldObject);
        if (index != -1) {
            healthCards.set(index, newObject);
        }
    }

    @Override
    public ArrayList<HealthCard> readAll() {
        return healthCards;
    }
    @Override
    public HealthCard findByIdentifier(ArrayList<String> identifier){
        for(HealthCard healthCard : healthCards){
            if(healthCard.getCardID() == Integer.parseInt(identifier.get(0))){
                return healthCard;
            }
        }
        return null;
    }
}