package ro.acs.flyweight.clase;

public class Buletin {
    private String info;
    private String votant;

    public Buletin(String info, String votant) {
        this.info = info;
        this.votant = votant;
    }

    public String getVotant() {
        return votant;
    }

    public String getInfo() {
        return info;
    }
}
