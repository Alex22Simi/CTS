package main;

import ro.ase.clase.AutoritatePescuitEager;
import ro.ase.clase.AutoritatePescuitLazy;

//Singleton ->constructor privat
//sa se realizeze o clasa singleton intr-un domeniu la alegere.
//Clasa trebuie sa contina minim 3 atribute
//eager initialization -> initializare cand se declara instanta
//lazy initialization -> ca solutie pt eager initialization -> lasam pe ultima data in main cand apelam get instance
//thread safe
public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager.concediaza(2);
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.setDenumire("AnpPa");
        autoritatePescuitEager.setWebSite("AnpPa.ro");
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.emiteAutorizatie("Popescu Paul");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager autoritatePescuitEager2 = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager2.emiteAutorizatie("Popescu Mihai");
        System.out.println(autoritatePescuitEager2.toString());

        AutoritatePescuitLazy lazyInstance = AutoritatePescuitLazy.getInstance("anpa", "anpa.ro", 11, 101);
        System.out.println(lazyInstance);

        AutoritatePescuitLazy lazyInstance2 = AutoritatePescuitLazy.getInstance("alex", "alex.ro", 10, 100);
        lazyInstance.emiteAutorizatie("Ionescu Marce");
        System.out.println(lazyInstance);

    }
}