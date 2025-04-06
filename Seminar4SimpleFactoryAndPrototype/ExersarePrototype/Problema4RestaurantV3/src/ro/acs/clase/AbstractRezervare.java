package ro.acs.clase;

public abstract class AbstractRezervare {
    protected String nume;
    protected int ora;
    protected int nrPersoane;
    protected int zi;
    //se incalca SRP?
    public AbstractRezervare() {
        this.nume = "NumeClient";
        this.ora = 10;
        this.nrPersoane = 1;
        this.zi = 1;
    }

    public AbstractRezervare(String nume, int ora, int nrPersoane, int zi) {
        if(nume.length() < 3) {
            this.nume = "Client";
        } else {
           this.nume = nume;
        }
        if(ora > 10 && ora < 22) {
            this.ora = ora;
        } else {
            this.ora = 10;
        }
        this.nrPersoane = nrPersoane;
        if(zi > 1 && zi < 31) {
            this.zi = zi;
        } else {
            this.zi = 1;
        }
    }

    public abstract AbstractRezervare cloneaza(int zi);
}
