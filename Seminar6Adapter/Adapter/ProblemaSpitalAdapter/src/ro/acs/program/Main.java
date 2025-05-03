package ro.acs.program;

import ro.acs.clase.AdapterMedicament;
import ro.acs.clase.IMedicament;
import ro.acs.clase.MedicamentFarmacie;
import ro.acs.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(IMedicament medicamentFarmacie) {
        System.out.println("Farmacia noastra va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
//        MedicamentSpital medicamentSpital = new MedicamentSpital(25, "Nurofen");
//        medicamentSpital.achizitioneazaMedicament();
//
//        System.out.println();
//
//        IMedicamentFramacie medicamentFramacie = new AdapterMedicament(medicamentSpital);
//        MedicamentFarmacie medicamentFramacie2 = new MedicamentFarmacie(300, "Injectie", true);
//        medicamentFramacie.cumparaMedicament();
//
//        System.out.println();
//
//        medicamentFramacie2.cumparaMedicament();

//        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(100, "Paracetamol", true);
//        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie(24, "Nurofen", true);
//        vindeMedicament(medicamentFarmacie);
//        System.out.println();
//        vindeMedicament(medicamentFarmacie2);
//        System.out.println();
//
//        MedicamentSpital medicamentSpital = new MedicamentSpital(150, "Parasinus");
//        MedicamentSpital medicamentSpital2 = new MedicamentSpital(20, "Theraflu");
//        medicamentSpital.achizitioneazaMedicament();
//        System.out.println();
//        vindeMedicament(new AdapterMedicament(medicamentSpital));

        IMedicament farmacie = new MedicamentFarmacie(120, "Parasinus", true);
        farmacie.cumparaMedicament();
        System.out.println();

        IMedicament spital = new AdapterMedicament(new MedicamentSpital(123, "Nurofen"));
        spital.cumparaMedicament();
        System.out.println();

    }
}