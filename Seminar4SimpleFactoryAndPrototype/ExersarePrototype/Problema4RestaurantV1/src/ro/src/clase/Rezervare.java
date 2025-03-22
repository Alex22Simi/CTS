package ro.src.clase;

public class Rezervare extends AbstractRezervare{
    protected boolean inInterior;

    private Rezervare() {
       super();
       this.inInterior = true;
    }

    public Rezervare(String nume, int ora, int nrPersoane, int zi, boolean inInterior) {
        super(nume, ora, nrPersoane, zi);
        this.inInterior = inInterior;
    }
    @Override
    public AbstractRezervare clonare(int zi) {
       Rezervare rezervare = new Rezervare();
       rezervare.inInterior = this.inInterior;
       rezervare.nume  = this.nume;
       rezervare.nrPersoane = this.nrPersoane;
       rezervare.ora = this.ora;
       rezervare.zi = zi;
       return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("inInterior=").append(inInterior);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", zi=").append(zi);
        sb.append('}');
        return sb.toString();
    }
}
