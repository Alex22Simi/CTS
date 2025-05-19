package ro.acs.flyweight.clase;

import java.util.HashMap;

public class BuletinPersonalizatFactory {
    private static HashMap<ESectii, BuletinPersonalizat> listaBuletine = new HashMap<>();

    public BuletinPersonalizat getBuletin(ESectii sectie) {
        if(!listaBuletine.containsKey(sectie)) {
            listaBuletine.put(sectie, new BuletinPersonalizat(sectie));
        }

            return listaBuletine.get(sectie);

    }
}
