package ro.acs.fabrici;

import ro.acs.clase.CheeseCake;
import ro.acs.clase.Clatita;
import ro.acs.clase.FelMancare;
import ro.acs.clase.Papanasi;

public class DesertFactory implements TipMancareFactory{
    private int cantitateZahar;

    public DesertFactory(int cantitateZahar) {
        this.cantitateZahar = cantitateZahar;
    }

    public void setCantitateZahar(int cantitateZahar) {
        this.cantitateZahar = cantitateZahar;
    }

    @Override
    public FelMancare preparareFelMancare(TipFelMancare tip, float pret, int nrCalorii) {
        switch (tip) {
            case Deserturi.Clatite -> {
                return new Clatita(pret, nrCalorii, this.cantitateZahar);
            }
            case Deserturi.CheeseCake -> {
                return new CheeseCake(pret, nrCalorii, this.cantitateZahar);
            }
            case Deserturi.Papanasi -> {
                return new Papanasi(pret, nrCalorii, this.cantitateZahar);
            }
            default -> {
                return null;
            }
        }
    }
}
