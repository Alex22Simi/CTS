package ro.acs.main;

import ro.acs.clase.AbstractRezervare;
import ro.acs.clase.RervareSepareu;
import ro.acs.clase.RezervareInterior;
import ro.acs.clase.RezervareTerasa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------INTERIOR----------------");
        AbstractRezervare abstractRezervare = new RezervareInterior(2,14,"Alex", 2, true);
        AbstractRezervare abstractRezervare1 = abstractRezervare.copiaza(5);
        AbstractRezervare abstractRezervare2 = abstractRezervare.copiaza(7);
        AbstractRezervare abstractRezervare3 = abstractRezervare2.copiaza(10);

        System.out.println(abstractRezervare.toString());
        System.out.println(abstractRezervare1.toString());
        System.out.println(abstractRezervare2.toString());
        System.out.println(abstractRezervare3.toString());

        System.out.println();
        abstractRezervare.setZiuaLunii(30);
        System.out.println(abstractRezervare.toString());
        System.out.println(abstractRezervare1.toString());
        System.out.println(abstractRezervare2.toString());
        System.out.println(abstractRezervare3.toString());
        System.out.println("-------------------TERASA----------------");

        AbstractRezervare abstractRezervareTerasa = new RezervareTerasa(4,21,"Simi", 15, false);
        AbstractRezervare abstractRezervareTerasa1 = abstractRezervareTerasa.copiaza(10);
        AbstractRezervare abstractRezervareTerasa2 = abstractRezervareTerasa1.copiaza(3);

        System.out.println(abstractRezervareTerasa.toString());
        System.out.println(abstractRezervareTerasa1.toString());
        System.out.println(abstractRezervareTerasa2.toString());

        System.out.println("-------------------SEPAREU----------------");
        AbstractRezervare abstractRezervareSepareu = new RervareSepareu(3,12,"Pavel", 3, false);
        AbstractRezervare abstractRezervareSepareu1 = abstractRezervareSepareu.copiaza(8);
        AbstractRezervare abstractRezervareSepareu2 = abstractRezervareSepareu1.copiaza(9);

        System.out.println(abstractRezervareSepareu.toString());
        System.out.println(abstractRezervareSepareu1.toString());
        System.out.println(abstractRezervareSepareu2.toString());


    }
}