package Controller;

import Domain.ECard;
import Domain.PaperCard;
import Domain.HealthCard;
import Repository.HealthCardRepository;

import java.util.ArrayList;

public class HealthCardController {
    private final HealthCardRepository healthCardRepository;

    public HealthCardController(HealthCardRepository healthCardRepository) {
        this.healthCardRepository = healthCardRepository;
    }

    public void addECard(ArrayList<String> eCardData) {
        ECard eCard = healthCardRepository.createECard(eCardData);
        healthCardRepository.add(eCard);
    }

    public void addPaperCard(ArrayList<String> paperCardData ) {
        PaperCard paperCard = healthCardRepository.createPaperCard(paperCardData);
        healthCardRepository.add(paperCard);
    }

    public void delete(ArrayList<String> identifier) {
        HealthCard healthCard = healthCardRepository.findByIdentifier(identifier);
        if (healthCard != null) {
            healthCardRepository.delete(healthCard);
        } else {
            throw new IllegalArgumentException("Nothing was found for the provided identifier.");
        }
    }

    public void update(ArrayList<String> identifier, ArrayList<String> newObjectData) {
        HealthCard oldHealthCard = healthCardRepository.findByIdentifier(identifier);
        if (oldHealthCard != null) {
            healthCardRepository.delete(oldHealthCard);

            if (oldHealthCard instanceof ECard) {
                ECard updatedECard = healthCardRepository.createECard(newObjectData);
                healthCardRepository.add(updatedECard);
            } else if (oldHealthCard instanceof PaperCard) {
                PaperCard updatedPaperCard = healthCardRepository.createPaperCard(newObjectData);
                healthCardRepository.add(updatedPaperCard);
            }
        } else {
            throw new IllegalArgumentException("Nothing was found for the provided identifier.");
        }
    }

    public ArrayList<HealthCard> readAll() {
        return healthCardRepository.readAll();
    }
}
