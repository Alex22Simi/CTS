package ro.acs.clase;

public class Spitalizare implements PacientAbstract{
    private int numarSalon;
    private int numarPat;
    private int numarZile;

    public Spitalizare(int numarSalon, int numarPat, int numarZile) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZile = numarZile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spitalizare{");
        sb.append("numarSalon=").append(numarSalon);
        sb.append(", numarPat=").append(numarPat);
        sb.append(", numarZile=").append(numarZile);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {

    }
}
