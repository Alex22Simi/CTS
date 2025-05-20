package ro.acs.flyweight.clase;

import java.util.HashMap;

public class RecomandareFactory {
    private static HashMap<ERecomandari, Recomandare> listaRecomandari = new HashMap<>();

    public Recomandare getRecomandari(ERecomandari tip) {
        if(!listaRecomandari.containsKey(tip)) {
            listaRecomandari.put(tip, new Recomandare(tip));
        }
        return listaRecomandari.get(tip);
    }
}
