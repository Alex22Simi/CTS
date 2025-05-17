package ro.acs.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProxySpital implements ISpital{
    private ISpital spital;
    private HashMap<String, Vizitator> vizitatori;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
        this.vizitatori = new HashMap<>();
    }

    @Override
    public void primesteVizitator(String numeVizitator, String numePacient) {
        if(!vizitatori.containsKey(numePacient)) {
            System.out.println("Pacientul " + numePacient + " are dreptul la o vizita pe zi, deci vizitatorul " + numeVizitator +
                    " fiind primul, poate face vizita.");
            vizitatori.put(numePacient, new Vizitator(numeVizitator));
        } else {
            System.out.println("Pacientul " + numePacient + " a beneficiat astazi de o vizita, avand dreptul doar la una pe zi.");
        }
    }

    @Override
    public void reseteazaVizite() {
        spital.reseteazaVizite();
        vizitatori.clear();
    }
}
