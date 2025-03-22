package ro.cts.main;

import ro.cts.clase.FabricaSupe;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.TipSupa;
import ro.cts.clase.Supa;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupe = new FabricaSupe(25, 100);
        Supa supaLegume = fabricaSupe.getSupe(TipSupa.Legume, 45);
        supaLegume.afiseazaDescriere();
        Supa supaVita = fabricaSupe.getSupe(TipSupa.Vita, 44);
        supaVita.afiseazaDescriere();
        Supa supaCocos = fabricaSupe.getSupe(TipSupa.Cocos, 33);
        supaCocos.afiseazaDescriere();
    }
}