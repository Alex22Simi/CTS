package ro.acs.composite.program;

import ro.acs.composite.clase.Composite;
import ro.acs.composite.clase.IProdus;
import ro.acs.composite.clase.MeniulZilei;
import ro.acs.composite.clase.NodFrunza;

public class Main {
    public static void main(String[] args) {
        IProdus meniu = new Composite("Meniu");
        IProdus parteAZilei = new Composite("Mic Dejun");
        IProdus parteAZilei2 = new Composite("Pranz");
        IProdus parteAZilei3 = new Composite("Cina");

        IProdus meniulZilei = new MeniulZilei("Meniul zilei");

        IProdus produs1 = new NodFrunza("Ceai", 10);
        IProdus produs2 = new NodFrunza("Gem", 25);
        IProdus produs3 = new NodFrunza("Friptura", 55);
        IProdus produs4 = new NodFrunza("Piure", 15);

        meniu.addElement(parteAZilei);
        meniu.addElement(parteAZilei2);
        meniu.addElement(parteAZilei3);

        meniu.addElement(meniulZilei);

        parteAZilei.addElement(produs1);
        parteAZilei.addElement(produs2);

        meniulZilei.addElement(produs3);
        meniulZilei.addElement(produs4);


        meniu.afiseazaInformatii();
        System.out.println( meniulZilei.getPret());
    }
}
