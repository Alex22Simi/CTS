package ro.acs.main;

import ro.acs.clase.AutoritateMasiniEager;
import ro.acs.clase.AutoritateMasiniLazy;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------EAGER----------------");
        AutoritateMasiniEager autoritateMasiniEager = AutoritateMasiniEager.getInstance();
        System.out.println(autoritateMasiniEager.toString());
        autoritateMasiniEager.reglementeazaModel("BMW");
        System.out.println(autoritateMasiniEager.toString());
        AutoritateMasiniEager autoritateMasiniEager1 = AutoritateMasiniEager.getInstance();
        System.out.println(autoritateMasiniEager1.toString());
        autoritateMasiniEager1.reglementeazaModel("Dacia");
        System.out.println(autoritateMasiniEager.toString());

        System.out.println("---------------------LAZY----------------");
        AutoritateMasiniLazy autoritateMasiniLazy = AutoritateMasiniLazy.getInstance("PSG", "PSG.ro", 1923);
        System.out.println(autoritateMasiniLazy.toString());
        AutoritateMasiniLazy autoritateMasiniLazy1 = AutoritateMasiniLazy.getInstance("LALA", "lala.ro", 1933);
        System.out.println(autoritateMasiniLazy1.toString());
        autoritateMasiniLazy1.reglementeazaModel("Logan");
        System.out.println(autoritateMasiniLazy.toString());


    }
}