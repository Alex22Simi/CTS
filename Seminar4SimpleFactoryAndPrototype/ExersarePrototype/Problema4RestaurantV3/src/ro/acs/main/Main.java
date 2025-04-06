package ro.acs.main;

import ro.acs.clase.AbstractRezervare;
import ro.acs.clase.RezervareInterior;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervare1 = new RezervareInterior("Messi", 21, 4, 5,true);
        AbstractRezervare rezervare2 = rezervare1.cloneaza(10);
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}