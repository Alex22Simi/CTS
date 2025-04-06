package ro.acs.program;

import ro.acs.clase.Candelavru;
import ro.acs.clase.Magazin;
import ro.acs.clase.MagazinBuilder;
import ro.acs.clase.PodeaLemnLucios;

public class Main {
    public static void main(String[] args) {
        MagazinBuilder builder = new MagazinBuilder();
        Magazin adidas = builder.addDecoratiune(new Candelavru()).setNrIntrari(3).build("Adidas", 100);
        System.out.println(adidas.toString());

        Magazin puma = builder.setPodea(new PodeaLemnLucios()).setNrIntrari(3).build("Puma", 200);
        System.out.println(puma.toString());
    }
}