package ro.acs.composite.program;

import ro.acs.composite.clase.Composite;
import ro.acs.composite.clase.INod;
import ro.acs.composite.clase.NodFrunza;

public class Main {
    public static void main(String[] args) {
        INod continentEuropa =  new Composite("Europa", 4,  false);
        INod taraRomania =  new Composite("Romania", 8,  true);
        INod taraFranta =  new Composite("Franta", 3,  false);

        INod virusCOVID =  new NodFrunza("Covid", 300,  true);
        INod virusRaceala =  new NodFrunza("Raceala", 5,  false);
        INod virusRomania =  new NodFrunza("VirusRomania", 500,  false);
        INod virusGripa =  new NodFrunza("Gripa", 254,  true);

        continentEuropa.adaugaNod(taraRomania);
        continentEuropa.adaugaNod(taraFranta);

        taraRomania.adaugaNod(virusCOVID);
        taraRomania.adaugaNod(virusRaceala);
        taraRomania.adaugaNod(virusRomania);

        taraFranta.adaugaNod(virusGripa);

        continentEuropa.afiseazaInfo();
        System.out.println();
        taraRomania.afiseazaInfo();

        System.out.println();
        taraRomania.stergeNod(virusCOVID);
        taraRomania.afiseazaInfo();

        System.out.println();
        System.out.println(taraFranta.getNodCopil(0));

        int nrCazuri = taraRomania.getTotalCases();
        System.out.println("Nr cazuri totale " + nrCazuri);
    }
}
