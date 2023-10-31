package Domain;

public class Medikament {
    private int medikamentID;
    private String name;
    private String Verabreichungsweg;
    private int mengeLager;
    private String verfallsdatum;

    public Medikament(int medikamentID, String name, String verabreichungsweg, int mengeLager, String verfallsdatum) {
        this.medikamentID = medikamentID;
        this.name = name;
        Verabreichungsweg = verabreichungsweg;
        this.mengeLager = mengeLager;
        this.verfallsdatum = verfallsdatum;
    }

    public int getMedikamentID() {
        return medikamentID;
    }

    public void setMedikamentID(int medikamentID) {
        this.medikamentID = medikamentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVerabreichungsweg() {
        return Verabreichungsweg;
    }

    public void setVerabreichungsweg(String verabreichungsweg) {
        Verabreichungsweg = verabreichungsweg;
    }

    public int getMengeLager() {
        return mengeLager;
    }

    public void setMengeLager(int mengeLager) {
        this.mengeLager = mengeLager;
    }

    public String getVerfallsdatum() {
        return verfallsdatum;
    }

    public void setVerfallsdatum(String verfallsdatum) {
        this.verfallsdatum = verfallsdatum;
    }

    @Override
    public String toString() {
        return "Medikament{" +
                "medikamentID=" + medikamentID +
                ", name='" + name + '\'' +
                ", Verabreichungsweg='" + Verabreichungsweg + '\'' +
                ", mengeLager=" + mengeLager +
                ", verfallsdatum='" + verfallsdatum + '\'' +
                '}';
    }
}
