package ro.acs.flyweight.program;

import ro.acs.flyweight.clase.Buletin;
import ro.acs.flyweight.clase.BuletinPersonalizatFactory;
import ro.acs.flyweight.clase.ESectii;

public class Main {
    public static void main(String[] args) {
        Buletin buletin1 = new Buletin("Buletin nr. 1", "Florin");
        Buletin buletin2 = new Buletin("Buletin nr. 2", "Alin");
        Buletin buletin3 = new Buletin("Buletin nr. 3", "Alex");
        Buletin buletin4 = new Buletin("Buletin nr. 4", "Cosmina");
        Buletin buletin5 = new Buletin("Buletin nr. 5", "David");

        BuletinPersonalizatFactory buletinPersonalizatFactory = new BuletinPersonalizatFactory();
        buletinPersonalizatFactory.getBuletin(ESectii.CLUJ).printeazaBuletin(buletin1);
        System.out.println();
        buletinPersonalizatFactory.getBuletin(ESectii.CLUJ).printeazaBuletin(buletin2);
        System.out.println();
        buletinPersonalizatFactory.getBuletin(ESectii.VALCEA).printeazaBuletin(buletin3);
        System.out.println();
        buletinPersonalizatFactory.getBuletin(ESectii.VALCEA).printeazaBuletin(buletin4);
        System.out.println();
        buletinPersonalizatFactory.getBuletin(ESectii.BUCURESTI).printeazaBuletin(buletin5);
        System.out.println();


    }
}