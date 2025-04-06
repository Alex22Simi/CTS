package ro.acs.main;

import ro.acs.clase.Client;
import ro.acs.clase.ListaOferte;

public class Main {
    public static void main(String[] args) {
        ListaOferte lista1 = new Client(100, 50, "Nicu", "OfertaTare");
        ListaOferte lista2 = lista1.cloneaza("Marcel");
        ListaOferte lista3 = lista2.cloneaza("Pavel");

        System.out.println(lista1.toString());
        System.out.println(lista2.toString());
        System.out.println(lista3.toString());
    }
}