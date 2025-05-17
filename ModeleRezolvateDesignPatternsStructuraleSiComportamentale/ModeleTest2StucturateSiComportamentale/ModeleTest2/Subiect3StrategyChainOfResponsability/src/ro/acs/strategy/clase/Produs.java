package ro.acs.strategy.clase;

public class Produs {
    private String nume;
    private int pret;
    private int nrRecenzii;

    public Produs(String nume, int pret, int nrRecenzii) {
        this.nume = nume;
        this.pret = pret;
        this.nrRecenzii = nrRecenzii;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }

    public int getNrRecenzii() {
        return nrRecenzii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrRecenzii=").append(nrRecenzii);
        sb.append('}');
        return sb.toString();
    }
}
