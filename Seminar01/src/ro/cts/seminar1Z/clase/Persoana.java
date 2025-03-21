package ro.cts.seminar1Z.clase;

import ro.cts.seminar1Z.interfete.IPersoana;

public abstract class Persoana implements IPersoana {
    protected String nume;
    private int varsta;

    public Persoana() {
        nume = "";
        varsta = 0;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    public abstract void afiseazaModInvatare();
}
