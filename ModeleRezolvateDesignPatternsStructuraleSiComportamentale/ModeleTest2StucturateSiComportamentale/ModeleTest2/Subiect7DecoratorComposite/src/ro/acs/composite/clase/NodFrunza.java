package ro.acs.composite.clase;

public class NodFrunza extends AbstractProdus{
    private String nume;
    private int nrBucati;

    public NodFrunza(String nume, int nrBucati) {
        this.nume = nume;
        this.nrBucati = nrBucati;
    }

    @Override
    public int getNrBucati() {
        return this.nrBucati;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NodFrunza{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrBucati=").append(nrBucati);
        sb.append('}');
        return sb.toString();
    }
}
