package ro.acs.program;


import ro.acs.clase.Document;
import ro.acs.clase.Imprimanta;
import ro.acs.clase.TipPrintare;

public class Main {
    public static void main(String[] args) {
        Imprimanta imprimanta = Imprimanta.getInstance();
        Imprimanta imprimanta2 = Imprimanta.getInstance();
        System.out.println(imprimanta.toString());

        System.out.println(imprimanta == imprimanta2);

        imprimanta.printeaza(new Document(100, true, "ABC"),2, 66, TipPrintare.COLOR);
        System.out.println(imprimanta.toString());
    }
}