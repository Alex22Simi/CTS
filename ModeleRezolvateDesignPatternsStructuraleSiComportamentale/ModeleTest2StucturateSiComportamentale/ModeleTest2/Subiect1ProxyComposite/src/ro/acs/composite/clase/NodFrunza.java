package ro.acs.composite.clase;

public class NodFrunza implements INod{
    private String nume;
    private int nrCazuri;
    private boolean existaVaccin;

    public NodFrunza(String nume, int nrCazuri, boolean existaVaccin) {
        this.nume = nume;
        this.nrCazuri = nrCazuri;
        this.existaVaccin = existaVaccin;
    }

    @Override
    public void afiseazaInfo() {
        System.out.println("Exista " + this.nrCazuri + " de cazuri de virusul " + this.nume + ".");
    }

    @Override
    public void adaugaNod(INod nod) {
        throw  new UnsupportedOperationException("Nu se poate adauga");
    }

    @Override
    public void stergeNod(INod nod) {
        throw  new UnsupportedOperationException("Nu se poate sterge");
    }

    @Override
    public INod getNodCopil(int index) {
        throw  new UnsupportedOperationException("Nu exista copil.");
    }

    @Override
    public int getTotalCases() {
        return this.nrCazuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NodFrunza{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrCazuri=").append(nrCazuri);
        sb.append(", existaVaccin=").append(existaVaccin);
        sb.append('}');
        return sb.toString();
    }
}
