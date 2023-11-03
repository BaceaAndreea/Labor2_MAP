package Domain;

public class HealthCard extends ElectronicCard {
    private int cardID;

    public HealthCard(String expirationDate, int pin, int electronicID, int cardID) {
        super(expirationDate, pin, electronicID);
        this.cardID = cardID;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    @Override
    public String toString() {
        return "HealthCard{" +
                "cardID=" + cardID +
                '}';
    }
}