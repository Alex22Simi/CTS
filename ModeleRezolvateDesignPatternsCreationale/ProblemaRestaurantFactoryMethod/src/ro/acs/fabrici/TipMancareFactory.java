package ro.acs.fabrici;

import ro.acs.clase.FelMancare;

public interface TipMancareFactory {
   public FelMancare preparareFelMancare(TipFelMancare tip, float pret, int nrCalorii);
}
