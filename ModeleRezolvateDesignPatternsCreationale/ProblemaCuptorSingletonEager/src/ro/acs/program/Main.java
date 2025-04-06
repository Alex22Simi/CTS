package ro.acs.program;

import ro.acs.clase.Comanda;
import ro.acs.clase.Cuptor;

public class Main {
    public static void main(String[] args) {
        Cuptor cuptor = Cuptor.getInstace();
        Cuptor cuptor2 = Cuptor.getInstace();

        Comanda comanda = new Comanda(100, "Peste", 89);
        Comanda comanda2 = new Comanda(200, "Pizza", 134);

        cuptor.addComanda(comanda);
        cuptor.addComanda(comanda2);

        cuptor2.afisareComenziAsteptare();

        System.out.println(cuptor == cuptor2);
    }
}