package Domain;

public class Arzt {
    private int arztID;
    private String name, vorname;
    private String geburstdatum;
    private int krankenhausID;
    private String kontakttelefon;
    private int spezialisierungID;
    private int kabinettID;
    public Arzt(int arztID, String name, String vorname, String geburstdatum, int krankenhausID, String kontakttelefon, int spezialisierungID, int kabinettID) {
        this.arztID = arztID;
        this.name = name;
        this.vorname = vorname;
        this.geburstdatum = geburstdatum;
        this.krankenhausID = krankenhausID;
        this.kontakttelefon = kontakttelefon;
        this.spezialisierungID = spezialisierungID;
        this.kabinettID = kabinettID;
    }
    public void setArztID(int arztID) {
        this.arztID = arztID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setGeburstdatum(String geburstdatum) {
        this.geburstdatum = geburstdatum;
    }

    public void setKrankenhausID(int krankenhausID) {
        this.krankenhausID = krankenhausID;
    }

    public void setKontakttelefon(String kontakttelefon) {
        this.kontakttelefon = kontakttelefon;
    }

    public void setSpezialisierungID(int spezialisierungID) {
        this.spezialisierungID = spezialisierungID;
    }

    public void setKabinettID(int kabinettID) {
        this.kabinettID = kabinettID;
    }
    public int getArztID() {
        return arztID;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getGeburstdatum() {
        return geburstdatum;
    }

    public int getKrankenhausID() {
        return krankenhausID;
    }

    public String getKontakttelefon() {
        return kontakttelefon;
    }

    public int getSpezialisierungID() {
        return spezialisierungID;
    }

    public int getKabinettID() {
        return kabinettID;
    }
    @Override
    public String toString() {
        return "Arzt{" +
                "arztID=" + arztID +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", geburstdatum='" + geburstdatum + '\'' +
                ", krankenhausID=" + krankenhausID +
                ", kontakttelefon='" + kontakttelefon + '\'' +
                ", spezialisierungID=" + spezialisierungID +
                ", kabinettid=" + kabinettID +
                '}';
    }
}




