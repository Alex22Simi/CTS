package ro.acs.program;


import ro.acs.clase.AbstractEchipaNationala;
import ro.acs.clase.Brazilia;
import ro.acs.clase.EchipaNationalaFactory;
import ro.acs.clase.TipEchipaNationala;

public class Main {
    public static void main(String[] args) {
        EchipaNationalaFactory factory = new EchipaNationalaFactory();

        AbstractEchipaNationala brazilia = factory.getEchipa(TipEchipaNationala.Brazilia, "defensiv", "America de Sud", "Brazilia");
        System.out.println(brazilia.toString());
        brazilia.afiseazaStilJoc();
        brazilia.getContinent();

        System.out.println();

        AbstractEchipaNationala argentina = factory.getEchipa(TipEchipaNationala.Argentina, "agresiv", "America de Sud", "Argentina");
        System.out.println(argentina.toString());
        argentina.afiseazaStilJoc();
        argentina.getContinent();

    }
}