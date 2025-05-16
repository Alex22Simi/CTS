package ro.acs.composite.clase;

public class NodFrunza extends AbstractNod{
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NodFrunza{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
