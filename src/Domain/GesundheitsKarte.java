package Domain;

public class GesundheitsKarte extends Patient{
    private String verfallsdatum;
    private int karteID;

    public GesundheitsKarte(int patientID, String name, String vorname,  String verfallsdatum, int karteID) {
        super(patientID, name, vorname, null, 0, null);
        this.verfallsdatum = verfallsdatum;
        this.karteID = karteID;
    }

    public String getVerfallsdatum() {
        return verfallsdatum;
    }

    public void setVerfallsdatum(String verfallsdatum) {
        verfallsdatum = verfallsdatum;
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
                "verfallsdatum='" + verfallsdatum + '\'' +
                ", karteID=" + karteID +
                '}';
    }
}

