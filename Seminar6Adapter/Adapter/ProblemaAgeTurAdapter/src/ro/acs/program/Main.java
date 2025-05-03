package ro.acs.program;

import ro.acs.clase.IOferta;
import ro.acs.clase.SoftAdapter;
import ro.acs.clase.SoftCazare;
import ro.acs.clase.SoftInchiriareMasini;


public class Main {
    public static void main(String[] args) {
        IOferta cazare = new SoftCazare("Hotel Oltul");
        cazare.rezerva();

        System.out.println();

        IOferta masina = new SoftAdapter(new SoftInchiriareMasini("BMW", 2));
        masina.rezerva();
    }
}