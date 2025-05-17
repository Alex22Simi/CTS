package ro.acs.composite.program;

import ro.acs.composite.clase.AbstractProdus;
import ro.acs.composite.clase.Composite;
import ro.acs.composite.clase.IProdus;
import ro.acs.composite.clase.NodFrunza;

public class Main {
    public static void main(String[] args) {
        AbstractProdus categorieSport = new Composite("Categorie produse sport");
        AbstractProdus subcategorieSportCamp = new Composite("Subcategorie produse sport camp");
        AbstractProdus subcategorieSportStatic = new Composite("Subcategorie produse sport static");
        AbstractProdus subcategorieSportSala = new Composite("Subcategorie produse sport sala");

        AbstractProdus paleteTenisCamp = new NodFrunza("Palete tenis camp", 500);
        AbstractProdus haltere = new NodFrunza("Haltere", 233);
        AbstractProdus baraDePiept = new NodFrunza("Bara de piept", 333);
        AbstractProdus adidasiSala = new NodFrunza("Adidasi sala", 15);

        categorieSport.addElement(subcategorieSportCamp);
        categorieSport.addElement(subcategorieSportStatic);
        categorieSport.addElement(subcategorieSportSala);

        subcategorieSportCamp.addElement(paleteTenisCamp);

        subcategorieSportStatic.addElement(haltere);
        subcategorieSportStatic.addElement(baraDePiept);

        subcategorieSportSala.addElement(adidasiSala);

        categorieSport.getInfo();
        System.out.println();
        System.out.println(subcategorieSportStatic.getCopil(0));
        System.out.println();
        System.out.println(categorieSport.getCopil(1));
        System.out.println();

        System.out.println(subcategorieSportStatic.getNrBucati());
        System.out.println();
        subcategorieSportStatic.removeElement(haltere);
        subcategorieSportStatic.getInfo();
        System.out.println();
        System.out.println(subcategorieSportStatic.getNrBucati());
    }
}
