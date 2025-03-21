package ro.acs.SingletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class AgentieImobiliaraRegistry {
    private String nume;
    private float cifraAfaceri;
    private Map<String, Anunt> registry = new HashMap<>();

    public AgentieImobiliaraRegistry(String nume, float cifraAfaceri) {
        this.nume = nume;
        this.cifraAfaceri = cifraAfaceri;
    }
    public Anunt publicaAnunt(String adresa, String proprietar, int nrCamere) {
        if(!registry.containsKey(adresa)) {
            Anunt anunt = new Anunt(adresa, proprietar, nrCamere, registry.size() +1);
            registry.put(adresa, anunt);
        }
        return registry.get(adresa);
    }
}
