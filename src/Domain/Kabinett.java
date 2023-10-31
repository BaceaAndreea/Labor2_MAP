package Domain;

public class Kabinett  {
    private int kabinettid;
    private String name;

    public Kabinett(int kabinettid, String name) {
        this.kabinettid = kabinettid;
        this.name = name;
    }

    public int getKabinettid() {
        return kabinettid;
    }

    public void setKabinettid(int kabinettid) {
        this.kabinettid = kabinettid;
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
                "kabinettid=" + kabinettid +
                ", name='" + name + '\'' +
                '}';
    }
}
