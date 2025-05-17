package ro.acs.composite.clase;

public class NodFrunza extends  AbstractNod{
    private String nume;
    private int pret;

    public NodFrunza(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println("Produsul " + this.nume + " are pretul " + this.pret);
    }

    @Override
    public int getPret() {
        return this.pret;
    }


}
