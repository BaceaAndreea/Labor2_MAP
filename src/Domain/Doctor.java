package Domain;

public class Doctor{
    private int doctorID;
    private String name, firstName;
    private String birthdate;
    private int hospitalID;
    private String contactPhone;
    private int specializationID;
    private int cabinetID;

    public Doctor(int doctorID, String name, String firstName, String birthdate, int hospitalID, String contactPhone, int specializationID, int cabinetID) {
        this.doctorID = doctorID;
        this.name = name;
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.hospitalID = hospitalID;
        this.contactPhone = contactPhone;
        this.specializationID = specializationID;
        this.cabinetID = cabinetID;
    }
    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setSpecializationID(int specializationID) {
        this.specializationID = specializationID;
    }

    public void setCabinetID(int cabinetID) {
        this.cabinetID = cabinetID;
    }
    public int getDoctorID() {
        return doctorID;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public int getHospitalID() {
        return hospitalID;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public int getSpecializationID() {
        return specializationID;
    }

    public int getCabinetID() {
        return cabinetID;
    }
    @Override
    public String toString() {
        return "Doctor{" +
                "doctorID=" + doctorID +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", hospitalID=" + hospitalID +
                ", contactPhone='" + contactPhone + '\'' +
                ", specializationID=" + specializationID +
                ", cabinetID=" + cabinetID +
                '}';
    }
}
