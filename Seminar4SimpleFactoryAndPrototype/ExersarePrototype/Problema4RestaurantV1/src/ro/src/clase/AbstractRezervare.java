package ro.src.clase;

public abstract class AbstractRezervare {
    protected String nume;
    protected int ora;
    protected int nrPersoane;
    protected int zi;

    protected AbstractRezervare() {
        this.nume = "NumeClient";
        this.ora = 10;
        this.nrPersoane = 1;
        this.zi = 1;
    }

    public AbstractRezervare(String nume, int ora, int nrPersoane, int zi) {
        if(nume.length() > 3) {
            this.nume = nume;
        } else {
            this.nume = "Client";
        }
        if(ora > 10 && ora < 22) {
            this.ora = ora;
        } else {
            this.ora = 10;
        }
        if(nrPersoane > 1 && nrPersoane < 10) {
            this.nrPersoane = nrPersoane;
        } else {
            this.nrPersoane = 1;
        }
        if(zi > 1 && zi < 31) {
            this.zi = zi;
        } else {
            this.zi = 1;
        }
    }
    public abstract AbstractRezervare clonare(int zi);
}
