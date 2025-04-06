package ro.acs.program;

import ro.acs.clase.AbstractEchipaNationala;
import ro.acs.clase.EchipaItalia;
import ro.acs.fabrici.*;


public class Main {
    public static void main(String[] args) {
        AbstractEchipaCreator echipaFactoryEuropa = new CreatorEuropa(1);
        AbstractEchipaCreator echipaFactoryAS = new CreatorAmericaDeSud(2);

        AbstractEchipaNationala echipaItalia = echipaFactoryEuropa.creeazaEchipa(TariEuropa.Italia, "defensiv", "Europa");
        echipaItalia.getContinent();
        System.out.println(echipaItalia.toString());

        AbstractEchipaNationala echipaBrazilia = echipaFactoryAS.creeazaEchipa(TariAmericaDeSud.Brazilia, "agresiv", "America De Sud");
        echipaBrazilia.getStilJoc();
        System.out.println(echipaBrazilia.toString());

    }
}