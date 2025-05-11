package ro.acs.clase;

public class Spitalizare {
    //aici punem atributele care se schimba
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Spitalizare(int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public int getNumarSalon() {
        return numarSalon;
    }

    public Spitalizare setNumarSalon(int numarSalon) {
        this.numarSalon = numarSalon;
        return this;
    }

    public int getNumarPat() {
        return numarPat;
    }

    public Spitalizare setNumarPat(int numarPat) {
        this.numarPat = numarPat;
        return this;
    }

    public int getNumarZileSpitalizare() {
        return numarZileSpitalizare;
    }

    public Spitalizare setNumarZileSpitalizare(int numarZileSpitalizare) {
        this.numarZileSpitalizare = numarZileSpitalizare;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spitalizare{");
        sb.append("numarSalon=").append(numarSalon);
        sb.append(", numarPat=").append(numarPat);
        sb.append(", numarZileSpitalizare=").append(numarZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
