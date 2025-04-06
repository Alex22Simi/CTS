package ro.acs.clase;

public class PersonalSpitalFactory {
        public  AbtractPersonalSpital crearePersonalSpital(TipPersonalSpital tip, String nume, int varsta, String departament) {
            switch(tip) {
                case TipPersonalSpital.Brancardier -> {
                    return new Brancardier(nume, varsta, departament);
                }
                case TipPersonalSpital.Asistent -> {
                    return new Asistent(nume, varsta, departament);
                }
                case TipPersonalSpital.Medic -> {
                    return new Medic(nume, varsta, departament);
                }
                default -> {
                    return null;
                }
            }

        }
}
