package ro.acs.program;

import ro.acs.clase.Comanda;
import ro.acs.clase.Cuptor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cuptor cuptor = Cuptor.getInstance();

        Comanda comanda = new Comanda(25, "PIZZA", 99);
        Comanda comanda2 = new Comanda(30, "PESTE", 150);

        cuptor.addComanda(comanda);
        cuptor.addComanda(comanda2);
        System.out.println(cuptor.toString());

        Cuptor cuptor2 = Cuptor.getInstance();

        System.out.println(cuptor == cuptor2);

    }
}