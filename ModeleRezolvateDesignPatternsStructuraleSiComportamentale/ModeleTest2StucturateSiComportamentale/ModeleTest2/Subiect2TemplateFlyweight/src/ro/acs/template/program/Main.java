package ro.acs.template.program;

import ro.acs.template.clase.AbstractPrimiriUrgente;
import ro.acs.template.clase.Pacient;
import ro.acs.template.clase.SpitalPrivat;
import ro.acs.template.clase.SpitalStat;

public class Main {
    public static void main(String[] args) {
        AbstractPrimiriUrgente spitalStat  = new SpitalStat();
        AbstractPrimiriUrgente spitalPrivat = new SpitalPrivat();

        Pacient pacient1 = new Pacient("Alex", true);
        Pacient pacient2 = new Pacient("Cosmina", true);
        Pacient pacient3 = new Pacient("Alin", true);
        Pacient pacient4 = new Pacient("Mada", true);
        Pacient pacient5 = new Pacient("David", true);
        Pacient pacient6 = new Pacient("Bogdan", true);

        spitalStat.gestionareCaz(pacient1);
        System.out.println();
        spitalStat.gestionareCaz(pacient2);
        System.out.println();
        spitalStat.gestionareCaz(pacient3);
        System.out.println();
        spitalStat.gestionareCaz(pacient4);
        System.out.println();
        spitalStat.gestionareCaz(pacient5);
        System.out.println();
        spitalStat.gestionareCaz(pacient6);
        System.out.println();

        Pacient pacient7 = new Pacient("Daniel", false);
        Pacient pacient8 = new Pacient("Spulber", true);
        Pacient pacient9 = new Pacient("Dan", true);

        spitalPrivat.gestionareCaz(pacient7);
        System.out.println();
        spitalPrivat.gestionareCaz(pacient8);
        System.out.println();
        spitalPrivat.gestionareCaz(pacient9);


    }
}