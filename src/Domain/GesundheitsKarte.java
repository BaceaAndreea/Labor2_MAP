package Domain;

public class GesundheitsKarte extends ElectronischeKarte {
    private int karteID;

    public GesundheitsKarte(String verfallsdatum, int pin, int karteID) {
        super(verfallsdatum, pin);
        this.karteID = karteID;
    }

    public int getKarteID() {
        return karteID;
    }

    public void setKarteID(int karteID) {
        this.karteID = karteID;
    }

    @Override
    public String toString() {
        return "GesundheitsKarte{" +
                "karteID=" + karteID +
                '}';
    }
}

