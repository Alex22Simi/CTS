package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupe = new FabricaSupe(100, 1);
        Supa supaLegume = fabricaSupe.getSupa(TipSupa.Legume, "Bors, Legume", 200);
        supaLegume.preparaSupa();
        Supa supaVita = fabricaSupe.getSupa(TipSupa.Vita, "Rosii", 15);
        supaVita.preparaSupa();
        Supa supaCiuoerci = fabricaSupe.getSupa(TipSupa.Ciuperci, "Ardei", 100);
        supaCiuoerci.preparaSupa();
    }
}