package Domain;

public class Beratung {
    private int patientID;
    private int arztID;
    private String datum;
    private int krankheitID;
    private boolean karte;
    private int preis;

    public Beratung(int patientID, int arztID, String datum, int krankheitID, boolean karte, int preis) {
        this.patientID = patientID;
        this.arztID = arztID;
        this.datum = datum;
        this.krankheitID = krankheitID;
        this.karte = karte;
        this.preis = preis;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getArztID() {
        return arztID;
    }

    public void setArztID(int arztID) {
        this.arztID = arztID;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getKrankheitID() {
        return krankheitID;
    }

    public void setKrankheitID(int krankheitID) {
        this.krankheitID = krankheitID;
    }

    public boolean isKarte() {
        return karte;
    }

    public void setKarte(boolean karte) {
        this.karte = karte;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Beratung{" +
                "patientID=" + patientID +
                ", arztID=" + arztID +
                ", datum='" + datum + '\'' +
                ", krankheitID=" + krankheitID +
                ", karte=" + karte +
                ", preis=" + preis +
                '}';
    }
}
