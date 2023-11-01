package Domain;

public class Patient {
    private int patientID;
    private String name;
    private String vorname;
    private String geburtsdatum;
    private String kontakttelefon;
    private int karteID;

    public Patient(int patientID, String name, String vorname, String geburtsdatum, String kontakttelefon, int karteID) {
        this.patientID = patientID;
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;;
        this.kontakttelefon = kontakttelefon;
        this.karteID = karteID;
    }

    public int getKarteID() {
        return karteID;
    }

    public void setKarteID(int karteID) {
        this.karteID = karteID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getKontakttelefon() {
        return kontakttelefon;
    }

    public void setKontakttelefon(String kontakttelefon) {
        this.kontakttelefon = kontakttelefon;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID=" + patientID +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", geburtsdatum='" + geburtsdatum + '\'' +
                ", kontakttelefon='" + kontakttelefon + '\'' +
                ", karteID=" + karteID +
                '}';
    }
}










