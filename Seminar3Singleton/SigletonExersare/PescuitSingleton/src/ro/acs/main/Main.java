package ro.acs.main;

import ro.acs.clase.AutoritatePescuitEager;
import ro.acs.clase.AutoritatePescuitLazy;

public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstance();
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.angajeaza(2);
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.concediaza(1);
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.emiteAutoritate("Dinita Ilie");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager autoritatePescuitEager1 = AutoritatePescuitEager.getInstance();
        System.out.println(autoritatePescuitEager1.toString());
        autoritatePescuitEager1.emiteAutoritate("Simionescu Alin");
        System.out.println(autoritatePescuitEager1.toString());

        System.out.println(autoritatePescuitEager == autoritatePescuitEager1);

        System.out.println("------------DE AICI TESTAM LAZY INITIALIZATION---------");
        AutoritatePescuitLazy autoritatePescuitLazy = AutoritatePescuitLazy.getInstance("ASE", "ASE.ro", 100, 778);
        System.out.println(autoritatePescuitLazy.toString());
        AutoritatePescuitLazy autoritatePescuitLazy2 = AutoritatePescuitLazy.getInstance("RAPID", "RAPID.ro", 1000, 1923);
        System.out.println(autoritatePescuitLazy2.toString());
        autoritatePescuitLazy2.emiteAutorizatie("Simionescu Alexandru");
        System.out.println(autoritatePescuitLazy2.toString());


    }
}