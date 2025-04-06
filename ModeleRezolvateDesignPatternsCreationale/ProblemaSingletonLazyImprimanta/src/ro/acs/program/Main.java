package ro.acs.program;


import ro.acs.clase.Document;
import ro.acs.clase.Imprimanta;
import ro.acs.clase.TipPrintare;

public class Main {
    public static void main(String[] args) {
        Imprimanta i1 = Imprimanta.getInstance();
        Imprimanta i2 = Imprimanta.getInstance();

        System.out.println(i1 == i2);

        i1.printeaza(new Document(100, true, "ABC"), 10, 50, TipPrintare.COLOR);
        System.out.println(i2.toString());

    }
}