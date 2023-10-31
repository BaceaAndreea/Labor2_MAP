package Domain;

public class Operation {
    private int patientID, arztID;
    private String datum;
    private int krankenheitid;
    private String name;
    private int medikamentID;

    public Operation(int patientID, int arztID, String datum, int krankenheitid, String name, int medikamentID) {
        this.patientID = patientID;
        this.arztID = arztID;
        this.datum = datum;
        this.krankenheitid = krankenheitid;
        this.name = name;
        this.medikamentID = medikamentID;
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

    public int getKrankenheitid() {
        return krankenheitid;
    }

    public void setKrankenheitid(int krankenheitid) {
        this.krankenheitid = krankenheitid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMedikamentID() {
        return medikamentID;
    }

    public void setMedikamentID(int medikamentID) {
        this.medikamentID = medikamentID;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "patientID=" + patientID +
                ", arztID=" + arztID +
                ", datum='" + datum + '\'' +
                ", krankenheitid=" + krankenheitid +
                ", name='" + name + '\'' +
                ", medikamentID=" + medikamentID +
                '}';
    }
}
