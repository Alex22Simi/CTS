package ro.acs.program;


import ro.acs.clase.IRezervare;
import ro.acs.clase.NumarPersoaneProxy;
import ro.acs.clase.ProxyOra;
import ro.acs.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Gigel", 5, 15);
        System.out.println();

        IRezervare proxy = new NumarPersoaneProxy(rezervare);
        proxy.rezerva("Gigel", 5, 15);
        System.out.println();

        IRezervare proxyOra = new ProxyOra(proxy);
        proxyOra.rezerva("Popescu", 4, 19);

    }
}