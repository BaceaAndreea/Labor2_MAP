package Domain;

public class Krankenhaus {
    private int krankenhausID;
    private String name;
    private int kapazitat;

    public Krankenhaus(int krankenhausID, String name, int kapazitat) {
        this.krankenhausID = krankenhausID;
        this.name = name;
        this.kapazitat = kapazitat;
    }

    public int getKrankenhausID() {
        return krankenhausID;
    }

    public void setKrankenhausID(int krankenhausID) {
        this.krankenhausID = krankenhausID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKapazitat() {
        return kapazitat;
    }

    public void setKapazitat(int kapazitat) {
        this.kapazitat = kapazitat;
    }

    @Override
    public String toString() {
        return "Krankenhaus{" +
                "krankenhausID=" + krankenhausID +
                ", name='" + name + '\'' +
                ", kapazitat=" + kapazitat +
                '}';
    }
}
