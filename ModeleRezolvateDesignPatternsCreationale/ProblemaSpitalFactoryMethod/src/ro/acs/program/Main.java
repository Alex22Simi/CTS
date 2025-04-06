package ro.acs.program;

import ro.acs.clase.AbstractPersonal;
import ro.acs.clase.Medic;
import ro.acs.fabrici.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CrearePersonal personalMedical = new CrearePersonalMedical(1000);
        CrearePersonal personalNonMedical = new CrearePersonalNon_medical(500);

        AbstractPersonal medic = personalMedical.getPersonal(PersonalMedical.Medic, "Ionescu", 25);
        System.out.println(medic.getNume());
        System.out.println(medic.toString());

        System.out.println();

        AbstractPersonal secretar = personalNonMedical.getPersonal(PersonalNon_medical.Secretar, "Marcel", 3);
        System.out.println(secretar.getNume());
        System.out.println(secretar.toString());
    }
}