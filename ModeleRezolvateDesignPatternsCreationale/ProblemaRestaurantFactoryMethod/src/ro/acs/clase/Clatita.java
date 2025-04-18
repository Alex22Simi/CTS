package ro.acs.clase;

public class Clatita extends FelMancare{
    private int cantitateZahar;

    public Clatita(float pret, int nrCalorii, int cantitateZahar) {
        super(pret, nrCalorii);
        this.cantitateZahar = cantitateZahar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clatita{");
        sb.append("cantitateZahar=").append(cantitateZahar);
        sb.append(", pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
