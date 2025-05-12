package ro.acs.program;

import ro.acs.clase.Autobuz;
import ro.acs.clase.Calator;
import ro.acs.clase.MijlocTransport;
import ro.acs.clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator("calator1");
        Observer calator2 = new Calator("calator2");
        Observer calator3 = new Calator("calator3");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(calator2);
        ((Autobuz)autobuz).schimbaTraseul();
    }
}