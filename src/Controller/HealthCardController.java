package Controller;

import Decorator.Decorator;
import Domain.ECard;
import Domain.PaperCard;
import Domain.HealthCard;
import Repository.HealthCardRepository;

import java.util.ArrayList;


public class HealthCardController implements Decorator {
    private final HealthCardRepository healthCardRepository;

    public HealthCardController(HealthCardRepository healthCardRepository) {
        this.healthCardRepository = healthCardRepository;
    }

    //tot timpu returneaza o noua instanta a HealthCardController și primește un HealthCardRepository ca parametru.
    public static HealthCardController getInstance(HealthCardRepository healthCardRepository) {
        return new HealthCardController(healthCardRepository);
    }


    public void addECard(ArrayList<String> eCardData) {
        ECard eCard = healthCardRepository.createECard(eCardData);
        healthCardRepository.add(eCard);
        displayDetails(eCard);
    }

    public void addPaperCard(ArrayList<String> paperCardData ) {
        PaperCard paperCard = healthCardRepository.createPaperCard(paperCardData);
        healthCardRepository.add(paperCard);
        displayDetails(paperCard);
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

    public void displayDetails(Object healthCard){
        String cardType;
        int id;

        if (healthCard instanceof ECard) {
            cardType = "Electronic Card";
            id = ((ECard) healthCard).getElectronicID();
        } else if (healthCard instanceof PaperCard) {
            cardType = "Paper Card";
            id = ((PaperCard) healthCard).getWrittenID();
        } else {

            return;
        }

        System.out.println("+---------------------------------+");
        System.out.println("|           " + cardType + "            |");
        System.out.println("+---------------------------------+");
        System.out.println("| Expiration Date: " + ((HealthCard) healthCard).getExpirationDate() + addEmptySpace(((HealthCard) healthCard).getExpirationDate().length()) + "|");
        System.out.println("| PIN: ****                        |");
        System.out.println("| ID: " + id + addEmptySpace(String.valueOf(id).length()) + "|");
        System.out.println("+---------------------------------+");
    }
}
