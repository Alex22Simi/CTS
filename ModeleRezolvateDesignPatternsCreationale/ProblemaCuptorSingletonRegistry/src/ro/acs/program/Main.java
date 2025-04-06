package ro.acs.program;


import ro.acs.clase.Comanda;
import ro.acs.clase.CuptorRegistry;

public class Main {
    public static void main(String[] args) {
        Comanda comanda1 = new Comanda(10, "Cartofi", 101);
        Comanda comanda2 = new Comanda(55, "Peste", 50);
        Comanda comanda3 = new Comanda(66, "Pizza", 222);
        Comanda comanda4 = new Comanda(33, "Paine", 201);
        Comanda comanda5 = new Comanda(44, "Lasagna", 44);

        CuptorRegistry.addComanda(comanda1);
        CuptorRegistry.addComanda(comanda2);
        CuptorRegistry.addComanda(comanda3);
        CuptorRegistry.addComanda(comanda4);
        CuptorRegistry.addComanda(comanda5);

        CuptorRegistry.afisareComenziAsteptare();



    }
}