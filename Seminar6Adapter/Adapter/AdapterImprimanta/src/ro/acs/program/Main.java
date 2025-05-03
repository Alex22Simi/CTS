package ro.acs.program;

import ro.acs.clase.AdapterPrinter;
import ro.acs.clase.TonerOld;
import ro.acs.clase.NewToner;


public class Main {
    public static void main(String[] args) {
        TonerOld tonerOld = new TonerOld();
        tonerOld.print();

        NewToner tonerAdaptat = new AdapterPrinter(tonerOld);
        tonerAdaptat.print();
    }
}