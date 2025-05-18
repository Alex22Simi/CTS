package ro.acs.composite.program;

import ro.acs.composite.clase.AbstractVirus;
import ro.acs.composite.clase.Composite;
import ro.acs.composite.clase.NodFrunza;

public class Main {
    public static void main(String[] args) {
        AbstractVirus continentEuropa = new Composite("Europa", 5, false);
        AbstractVirus taraRo = new Composite("Romania", 4, false);
        AbstractVirus taraIt = new Composite("Italia", 9, true);
        AbstractVirus taraSp = new Composite("Spania", 7, true);

        NodFrunza virusCovid = new NodFrunza("Covid", 1973, true);
        NodFrunza virusGripa = new NodFrunza("Gripa", 3376137, false);
        NodFrunza virusTemperatura = new NodFrunza("Temperatura", 165136, true);
        NodFrunza virusNou = new NodFrunza("Nou", 2, false);

        continentEuropa.addElement(taraRo);
        continentEuropa.addElement(taraIt);
        continentEuropa.addElement(taraSp);

        taraRo.addElement(virusCovid);
        taraRo.addElement(virusGripa);
        taraIt.addElement(virusTemperatura);
        taraSp.addElement(virusNou);

        continentEuropa.afiseazaInfo();
        System.out.println();
        taraRo.afiseazaInfo();
        System.out.println();

        System.out.println(taraRo.getCopil(1));

        taraRo.removeElement(virusGripa);

        System.out.println();
        taraRo.afiseazaInfo();
    }
}
