package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeStikerFactory {
    private static Map<String,AStiker> prototipuri = new HashMap<>();

    static {
        Masina m  = new Masina("Audi", 2024);
        Stiker stiker = new Stiker(m, 50);

        Masina m2  = new Masina("Skoda", 2023);
        Stiker stiker2 = new Stiker(m2, 100);

        Masina m3  = new Masina("BMW", 2020);
        Stiker stiker3 = new Stiker(m3, 22);

        prototipuri.put(m.getCodUnic(), stiker);
        prototipuri.put(m2.getCodUnic(), stiker2);
        prototipuri.put(m3.getCodUnic(), stiker3);
    }
    public static AStiker getStiker(String codUnic) throws CloneNotSupportedException {
        if(prototipuri.containsKey(codUnic)) {
            return (AStiker) prototipuri.get(codUnic).clone();
        }
        return null;
    }
}
