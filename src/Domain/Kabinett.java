package Domain;

public class Kabinett  {
    private int kabinettID;
    private String name;

    public Kabinett(int kabinettID, String name) {
        this.kabinettID = kabinettID;
        this.name = name;
    }

    public int getKabinettID() {
        return kabinettID;
    }

    public void setKabinettID(int kabinettID) {
        this.kabinettID = kabinettID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kabinett{" +
                "kabinettID=" + kabinettID +
                ", name='" + name + '\'' +
                '}';
    }
}
