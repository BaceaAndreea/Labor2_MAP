package Domain;

public class Spezialisierung {
    private int spezialisierungsID;
    private String name;

    public Spezialisierung(int spezialisierungsID, String name) {
        this.spezialisierungsID = spezialisierungsID;
        this.name = name;
    }

    public int getSpezialisierungsID() {
        return spezialisierungsID;
    }

    public void setSpezialisierungsID(int spezialisierungsID) {
        this.spezialisierungsID = spezialisierungsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Spezialisierung{" +
                "spezialisierungsID=" + spezialisierungsID +
                ", name='" + name + '\'' +
                '}';
    }
}
