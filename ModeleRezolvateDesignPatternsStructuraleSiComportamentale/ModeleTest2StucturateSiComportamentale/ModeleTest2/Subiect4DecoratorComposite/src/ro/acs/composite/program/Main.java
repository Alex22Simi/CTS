package ro.acs.composite.program;

import ro.acs.composite.clase.AbstractNod;
import ro.acs.composite.clase.Composite;
import ro.acs.composite.clase.MeniulZilei;
import ro.acs.composite.clase.NodFrunza;

public class Main {
    public static void main(String[] args) {
        AbstractNod meniu = new Composite("Meniu");
        AbstractNod dimineata = new Composite("Dimineata");
        AbstractNod pranz = new Composite("Pranz");
        AbstractNod seara = new Composite("Seara");
        AbstractNod meniulZilei = new MeniulZilei("Meniul zilei");

        AbstractNod produs1 = new NodFrunza("Masline", 5);
        AbstractNod produs2 = new NodFrunza("Oua", 8);
        AbstractNod produs3 = new NodFrunza("Ciorba", 25);
        AbstractNod produs4 = new NodFrunza("Lapte", 10);
        AbstractNod produs5 = new NodFrunza("Clatite", 15);


        AbstractNod produs6 = new NodFrunza("Friptura", 55);
        AbstractNod produs7 = new NodFrunza("Orez", 10);


        meniu.addElement(dimineata);
        meniu.addElement(pranz);
        meniu.addElement(seara);
        meniu.addElement(meniulZilei);

        dimineata.addElement(produs1);
        dimineata.addElement(produs2);

        pranz.addElement(produs3);

        seara.addElement(produs4);
        seara.addElement(produs5);

        meniulZilei.addElement(produs6);
        meniu.addElement(produs7);

        meniu.afiseazaInformatii();
        System.out.println();
        dimineata.afiseazaInformatii();
        System.out.println();
        pranz.afiseazaInformatii();
        System.out.println();
        seara.afiseazaInformatii();
        System.out.println();
        meniulZilei.afiseazaInformatii();
        System.out.println();

        System.out.println(meniulZilei.getPret());
        System.out.println(meniu.getPret());
    }
}
