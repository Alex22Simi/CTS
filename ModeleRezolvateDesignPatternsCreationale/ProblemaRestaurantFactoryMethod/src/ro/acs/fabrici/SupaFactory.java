package ro.acs.fabrici;

import ro.acs.clase.FelMancare;
import ro.acs.clase.SupaCiuperci;
import ro.acs.clase.SupaLegume;
import ro.acs.clase.SupaVita;

public class SupaFactory implements  TipMancareFactory{
    private int cantitate;

    public SupaFactory(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelMancare preparareFelMancare(TipFelMancare tip, float pret, int nrCalorii) {
       switch (tip) {
           case Supe.Ciuperci -> {
               return new SupaCiuperci(pret, nrCalorii, this.cantitate);
           }
           case Supe.Legume -> {
              return  new SupaLegume(pret, nrCalorii, this.cantitate);
           }
           case Supe.Vita -> {
               return new SupaVita(pret, nrCalorii, this.cantitate);
           }
           default -> {
               return null;
           }
       }
    }
}
