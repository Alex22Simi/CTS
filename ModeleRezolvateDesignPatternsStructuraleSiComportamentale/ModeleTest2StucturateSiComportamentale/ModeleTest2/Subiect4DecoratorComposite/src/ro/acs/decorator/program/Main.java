package ro.acs.decorator.program;

import ro.acs.decorator.clase.IProdus;
import ro.acs.decorator.clase.Produs;
import ro.acs.decorator.clase.ProdusSpecificItalienesc;
import ro.acs.decorator.clase.ProdusSpecificSpaniol;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IProdus produs1 = new Produs("Paste", 35, Arrays.asList("Sos rosii", "Pui", "Sunca"));
        IProdus produs2 = new Produs("Pizza", 33, Arrays.asList("Salam", "Ardei", "Sunca" ,"Cascaval"));
        IProdus produs3 = new Produs("Ciorba", 25, Arrays.asList("Vita", "Legume", "Bors"));
        IProdus produs4 = new Produs("Tiramisu", 15, Arrays.asList("Lapte", "Oua", "Cafea"));

        IProdus produsSpaniol1 = new ProdusSpecificSpaniol(produs1, "Masline");
        produsSpaniol1.getDescriereIngrediente();
        System.out.println( produsSpaniol1.getPret());

        System.out.println();

        IProdus produsItalienesc1 = new ProdusSpecificItalienesc(produs2, "Ceapa");
        produsItalienesc1.getDescriereIngrediente();
        System.out.println( produsItalienesc1.getPret());

        System.out.println();

        IProdus produsItalienesc2 = new ProdusSpecificItalienesc(produs3, "Crutoane");
        produsItalienesc2.getDescriereIngrediente();
        System.out.println( produsItalienesc2.getPret());

        System.out.println();

        IProdus produsSpaniol2 = new ProdusSpecificItalienesc(produs4, "Faina");
        produsSpaniol2.getDescriereIngrediente();
        System.out.println( produsSpaniol2.getPret());

    }
}