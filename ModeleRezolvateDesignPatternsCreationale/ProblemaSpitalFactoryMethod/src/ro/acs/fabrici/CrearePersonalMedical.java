package ro.acs.fabrici;

import ro.acs.clase.AbstractPersonal;
import ro.acs.clase.Asistent;
import ro.acs.clase.Bracandier;
import ro.acs.clase.Medic;

public class CrearePersonalMedical extends CrearePersonal{
    private int sporPersonalMedical;

    public CrearePersonalMedical(int sporPersonalMedical) {
        this.sporPersonalMedical = sporPersonalMedical;
    }

    @Override
    public AbstractPersonal getPersonal(TipPersonal tip, String nume, int vechime) {
        switch(tip) {
            case PersonalMedical.Medic -> {
                return new Medic(nume, vechime, this.sporPersonalMedical);
            }
            case PersonalMedical.Asistent -> {
                return new Asistent(nume, vechime, this.sporPersonalMedical);
            }
            case PersonalMedical.Bracandier -> {
                return new Bracandier(nume, vechime, this.sporPersonalMedical);
            }
            default -> {
                return null;
            }
        }
    }
}
