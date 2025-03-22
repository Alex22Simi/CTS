package ro.cts.main;

import ro.cts.clase.Bucatarie;
import ro.cts.clase.SupaCiuperci;
import ro.cts.clase.TipSupe;
import ro.cts.clase.Supa;

public class Main {
    public static void main(String[] args) {
        Bucatarie bucatarie = new Bucatarie(23, 25);
        Supa supaLegume = bucatarie.getSupa(TipSupe.Legume, true, false, 10);
        Supa supaCiuperci = bucatarie.getSupa(TipSupe.Ciuperci, true, false, 5);
        Supa supaVita = bucatarie.getSupa(TipSupe.Vita, true, true, 3);
        supaLegume.afiseazaDescriere();
        supaCiuperci.afiseazaDescriere();
        supaVita.afiseazaDescriere();

        System.out.println();

        Bucatarie cantina = new Bucatarie(400, 10);
        Supa supaLegumeCantina = cantina.getSupa(TipSupe.Legume, true, false, 10);
        Supa supaCiuperciCantina = cantina.getSupa(TipSupe.Ciuperci, true, false, 5);
        Supa supaVitaCantina = cantina.getSupa(TipSupe.Vita, true, true, 3);
        supaLegumeCantina.afiseazaDescriere();
        supaCiuperciCantina.afiseazaDescriere();
        supaVitaCantina.afiseazaDescriere();
    }
}