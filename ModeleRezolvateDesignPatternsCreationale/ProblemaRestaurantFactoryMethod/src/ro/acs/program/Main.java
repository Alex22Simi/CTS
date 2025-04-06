package ro.acs.program;


import ro.acs.clase.FelMancare;
import ro.acs.fabrici.*;

public class Main {
    public static void main(String[] args) {
        TipMancareFactory factorySupe = new SupaFactory(300);
        TipMancareFactory factoryDeserturi = new DesertFactory(100);

        FelMancare supa1 = factorySupe.preparareFelMancare(Supe.Vita, 15, 100);
        FelMancare supa2 = factorySupe.preparareFelMancare(Supe.Ciuperci, 10, 80);
        FelMancare supa3 = factorySupe.preparareFelMancare(Supe.Legume, 5, 40);

        FelMancare desert1 = factoryDeserturi.preparareFelMancare(Deserturi.Clatite, 45, 400);
        FelMancare desert2 = factoryDeserturi.preparareFelMancare(Deserturi.Papanasi, 35, 350);
        FelMancare desert3 = factoryDeserturi.preparareFelMancare(Deserturi.CheeseCake, 50, 250);

        System.out.println(supa1.toString());
        System.out.println(supa2.toString());
        System.out.println(supa3.toString());

        System.out.println();

        System.out.println(desert1.toString());
        System.out.println(desert2.toString());
        System.out.println(desert3.toString());

    }
}