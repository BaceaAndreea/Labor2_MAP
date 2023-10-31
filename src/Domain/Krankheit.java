package Domain;

public class Krankheit {
    private int krankheitID;
    private String name;
    public Krankheit(int krankheitID, String name) {
        this.krankheitID = krankheitID;
        this.name = name;
    }

    public int getKrankheitID() {
        return krankheitID;
    }

    public void setKrankheitID(int krankheitID) {
        this.krankheitID = krankheitID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Krankheit{" +
                "krankheitID=" + krankheitID +
                ", name='" + name + '\'' +
                '}';
    }
}
