package ro.acs.flyweight.clase;

import java.util.HashMap;

public class FactoryRecomandare {
    private static HashMap<TipRecomandare, Recomandare> listaRecomandari = new HashMap<>();
    public Recomandare getRecomandare(TipRecomandare tip) {
        if(!listaRecomandari.containsKey(tip)) {
            listaRecomandari.put(tip, new Recomandare(tip));
        }
        return listaRecomandari.get(tip);
    }
}
