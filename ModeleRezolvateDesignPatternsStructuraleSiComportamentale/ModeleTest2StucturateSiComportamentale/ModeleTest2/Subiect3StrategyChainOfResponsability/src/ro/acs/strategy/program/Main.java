package ro.acs.strategy.program;


import ro.acs.strategy.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produs produs1 = new Produs("Laptop", 4500, 10);
        Produs produs2 = new Produs("Masina de spalat", 3500, 0);
        Produs produs3 = new Produs("TV", 2500, 100);
        Produs produs4 = new Produs("Masa", 359, 0);
        List<Produs> produse = new ArrayList<>();

        produse.add(produs1);
        produse.add(produs2);
        produse.add(produs3);
        produse.add(produs4);


        IProdus strategie = new StrategiaPretCrescator();
        Utilizator utilizator1 = new Utilizator("Cosmina", strategie);
        utilizator1.afiseazaListaProduseDupaStrategie(produse);

        System.out.println();

        IProdus strategie2 = new StrategiaPretDescrescator();
        utilizator1.setProdusStrategie(strategie2);
        utilizator1.afiseazaListaProduseDupaStrategie(produse);

        System.out.println();

        IProdus strategie3 = new StrategieRecenzie();
        utilizator1.setProdusStrategie(strategie3);
        utilizator1.afiseazaListaProduseDupaStrategie(produse);
    }
}