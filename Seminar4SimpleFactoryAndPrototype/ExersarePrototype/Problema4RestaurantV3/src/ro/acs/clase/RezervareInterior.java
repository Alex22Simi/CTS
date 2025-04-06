package ro.acs.clase;

public class RezervareInterior extends AbstractRezervare{
    private boolean doresteLocGeam;
    public RezervareInterior() {
        super();
    }

    public RezervareInterior(String nume, int ora, int nrPersoane, int zi, boolean doresteLocGeam) {
        super(nume, ora, nrPersoane, zi);
        this.doresteLocGeam = doresteLocGeam;
    }

    @Override
    public AbstractRezervare cloneaza(int zi) {
        RezervareInterior rezervare = new RezervareInterior();
        rezervare.nume = this.nume;
        rezervare.ora = this.ora;
        rezervare.nrPersoane = this.nrPersoane;
        rezervare.zi  = zi;
        rezervare.doresteLocGeam = this.doresteLocGeam;
        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("doresteLocGeam=").append(doresteLocGeam);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", zi=").append(zi);
        sb.append('}');
        return sb.toString();
    }
}
