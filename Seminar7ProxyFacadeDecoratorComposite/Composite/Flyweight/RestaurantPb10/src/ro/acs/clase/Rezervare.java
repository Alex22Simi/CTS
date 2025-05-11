package ro.acs.clase;

public class Rezervare {
    private int nrMasa;
    private int nrPers;
    private int ora;

    public Rezervare(int nrMasa, int nrPers, int ora) {
        this.nrMasa = nrMasa;
        this.nrPers = nrPers;
        this.ora = ora;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public Rezervare setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
        return this;
    }

    public int getNrPers() {
        return nrPers;
    }

    public Rezervare setNrPers(int nrPers) {
        this.nrPers = nrPers;
        return this;
    }

    public int getOra() {
        return ora;
    }

    public Rezervare setOra(int ora) {
        this.ora = ora;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPers=").append(nrPers);
        sb.append(", ora=").append(ora);
        sb.append('}');
        return sb.toString();
    }
}
