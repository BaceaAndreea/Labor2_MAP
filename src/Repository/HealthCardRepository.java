package Repository;

import Domain.ECard;
import Domain.PaperCard;
import Domain.HealthCard;
import Factory.ECardFactory;
import Factory.HealthCardFactory;
import Factory.PaperCardFactory;

import java.util.ArrayList;

public class HealthCardRepository implements RepositoryInterface<HealthCard> {
    private final ArrayList<HealthCard> healthCards = new ArrayList<>();
    private final HealthCardFactory<ECard> eCardFactory ;
    private final HealthCardFactory<PaperCard> paperCardFactory;

    public HealthCardRepository(HealthCardFactory<ECard> eCardFactory, HealthCardFactory<PaperCard> paperCardFactory) {
        this.eCardFactory = eCardFactory;
        this.paperCardFactory = paperCardFactory;
    }


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
    public HealthCard findByIdentifier(ArrayList<String> identifier) {
        for (HealthCard healthCard : healthCards) {
            if (healthCard instanceof ECard) {
                ECard eCard = (ECard) healthCard;
                if (eCard.getElectronicID() == Integer.parseInt(identifier.get(0))) {
                    return eCard;
                }
            } else if (healthCard instanceof PaperCard) {
                PaperCard paperCard = (PaperCard) healthCard;
                if (paperCard.getWrittenID() == Integer.parseInt(identifier.get(0))) {
                    return paperCard;
                }
            }
        }
        return null;
    }
}
