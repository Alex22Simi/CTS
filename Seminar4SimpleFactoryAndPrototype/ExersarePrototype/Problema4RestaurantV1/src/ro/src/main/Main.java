package ro.src.main;

import ro.src.clase.AbstractRezervare;
import ro.src.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervar1 = new Rezervare("Alex", 18, 4, 2, false);
        System.out.println(rezervar1.toString());
        AbstractRezervare rezervare2 = rezervar1.clonare(3);
        System.out.println(rezervare2.toString());

    }
}