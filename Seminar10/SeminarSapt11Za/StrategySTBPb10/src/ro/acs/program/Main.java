package ro.acs.program;

import ro.acs.clase.*;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlataCardCalatorie = new CardCalatorie(1);

        Calator calator1 = new Calator("Alex", metodaPlataCardCalatorie);
        calator1.platesteBilet(1);
        calator1.setMetodaPlata(new PlataSMS());
        calator1.platesteBilet(1);
        calator1.setMetodaPlata(metodaPlataCardCalatorie);
        calator1.platesteBilet(1);

    }
}