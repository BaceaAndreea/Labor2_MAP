package Domain;

public class ElectronicCard {
    private String expirationDate;
    private int pin;
    private int electronicID;

    public ElectronicCard(String expirationDate, int pin, int electronicID) {
        this.expirationDate = expirationDate;
        this.pin = pin;
        this.electronicID = electronicID;
    }

    public int getElectronicID() {
        return electronicID;
    }

    public void setElectronicID(int electronicID) {
        this.electronicID = electronicID;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "ElectronicCard{" +
                "expirationDate='" + expirationDate + '\'' +
                ", pin=" + pin +
                ", electronicID=" + electronicID +
                '}';
    }
}