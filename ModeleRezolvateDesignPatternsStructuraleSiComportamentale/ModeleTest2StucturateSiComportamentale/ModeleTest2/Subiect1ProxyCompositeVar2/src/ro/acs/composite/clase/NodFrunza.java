package ro.acs.composite.clase;

public class NodFrunza extends AbstractVirus{

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
        System.out.println("Virusul " + this.nume + " are " + this.nrCazuri + " cazuri.");
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
