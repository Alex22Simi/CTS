package ro.acs.fabrici;

import ro.acs.clase.AbstractPersonal;
import ro.acs.clase.Registrator;
import ro.acs.clase.Secretar;

public class CrearePersonalNon_medical extends CrearePersonal{
    private int sporPersonalNonMedical;

    public CrearePersonalNon_medical(int sporPersonalNonMedical) {
        this.sporPersonalNonMedical = sporPersonalNonMedical;
    }

    @Override
    public AbstractPersonal getPersonal(TipPersonal tip, String nume, int vechime) {
        switch (tip) {
            case PersonalNon_medical.Registrator -> {
                return new Registrator(nume, vechime, this.sporPersonalNonMedical);
            }
            case PersonalNon_medical.Secretar -> {
                return new Secretar(nume, vechime, this.sporPersonalNonMedical);
            }
            default -> {
                return null;
            }
        }
    }
}
