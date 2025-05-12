package ro.acs.clase;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Calator setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
        return this;
    }

    public Calator(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(float pretBilet) {
        this.metodaPlata.plataste(pretBilet);
    }
}
