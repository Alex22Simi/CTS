package ro.acs.template.program;


import ro.acs.template.clase.AbstractPrimiriUrgente;
import ro.acs.template.clase.Pacient;
import ro.acs.template.clase.SpitalPrivat;
import ro.acs.template.clase.SpitalPublic;

public class Main {
    public static void main(String[] args) {
        AbstractPrimiriUrgente spitalPublic = new SpitalPublic();
        AbstractPrimiriUrgente spitalPrivat = new SpitalPrivat();

        Pacient pacient1 = new Pacient("Alex", true);
        Pacient pacient2 = new Pacient("Cosmina", false);
        Pacient pacient3 = new Pacient("Alin", false);
        Pacient pacient4 = new Pacient("Mada", true);
        Pacient pacient5 = new Pacient("Mario", true);
        Pacient pacient6 = new Pacient("Gabi", true);

        spitalPublic.primesteUrgenta(pacient1);
        System.out.println();
        spitalPublic.primesteUrgenta(pacient2);
        System.out.println();

        spitalPrivat.primesteUrgenta(pacient3);
        System.out.println();
        spitalPrivat.primesteUrgenta(pacient4);
        System.out.println();

        spitalPublic.primesteUrgenta(pacient5);
        System.out.println();
        spitalPublic.primesteUrgenta(pacient6);


    }
}