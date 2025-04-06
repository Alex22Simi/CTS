package ro.acs.program;

import ro.acs.clase.*;


public class Main {
    public static void main(String[] args) {
        PersonalSpitalFactory personalFactory = new PersonalSpitalFactory();

        AbtractPersonalSpital asistent = personalFactory.crearePersonalSpital(TipPersonalSpital.Asistent, "Daniela", 44, "Cardiologie");
        System.out.println(asistent.toString());
        asistent.getVechimeAproximativa();

        AbtractPersonalSpital bracardier = personalFactory.crearePersonalSpital(TipPersonalSpital.Brancardier, "Ion", 35, "Neurologie");
        System.out.println(bracardier.toString());
        bracardier.getVechimeAproximativa();

        AbtractPersonalSpital medic = personalFactory.crearePersonalSpital(TipPersonalSpital.Medic, "Valentin", 60, "Imagistica");
        System.out.println(medic.toString());
        medic.getVechimeAproximativa();
    }
}