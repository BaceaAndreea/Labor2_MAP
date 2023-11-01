package Domain;

public class ElectronischeKarte {
    private String verfallsdatum;
    private int pin;

    public ElectronischeKarte(String verfallsdatum, int pin) {
        this.verfallsdatum = verfallsdatum;
        this.pin = pin;
    }

    public String getVerfallsdatum() {
        return verfallsdatum;
    }

    public void setVerfallsdatum(String verfallsdatum) {
        this.verfallsdatum = verfallsdatum;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "ElectronischeKarte{" +
                "verfallsdatum='" + verfallsdatum + '\'' +
                ", pin=" + pin +
                '}';
    }
}
