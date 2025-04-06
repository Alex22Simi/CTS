package ro.acs.main;

import ro.acs.clase.Senzor;
import ro.acs.clase.SenzorBuilder;


public class Main {
    public static void main(String[] args) {
        SenzorBuilder builder = new SenzorBuilder();

        Senzor senzorChel = builder.build();
        System.out.println(senzorChel.toString());

        Senzor senzorPM2_5 = builder.setPM2_5(true).build();
        System.out.println(senzorPM2_5.toString());

        Senzor senzorCOandVOC = builder.setVOC(true).setCO(true).build();
        System.out.println(senzorCOandVOC.toString());

        senzorCOandVOC.nrAbilitatiSenzor();
        senzorChel.nrAbilitatiSenzor();
        senzorPM2_5.nrAbilitatiSenzor();

    }
}