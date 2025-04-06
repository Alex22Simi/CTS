package ro.acs.clase;

public class CheeseCake extends FelMancare{
    private int cantitateZahar;

    public CheeseCake(float pret, int nrCalorii, int cantitateZahar) {
        super(pret, nrCalorii);
        this.cantitateZahar = cantitateZahar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CheeseCake{");
        sb.append("cantitateZahar=").append(cantitateZahar);
        sb.append(", pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
