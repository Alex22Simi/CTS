package ro.acs.SigletonRegistry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritateMasiniRegistry {
    private String nume;
    private String webSite;
    private Map<String, Reglementare> registry = new HashMap<>();
    private static AutoritateMasiniRegistry instance = null;

    public AutoritateMasiniRegistry(String nume, String webSite) {
        this.nume = nume;
        this.webSite = webSite;
    }

    public static AutoritateMasiniRegistry getInstance(String nume, String webSite) {
        if(instance == null) {
            instance = new AutoritateMasiniRegistry(nume, webSite);
        }
        return instance;
    }

    public Reglementare reglementareModel(String model) {
        if(!registry.containsKey(model)) {
            registry.put(model, new Reglementare(model, registry.size() + 1, new Date().toString()));
        }
        return registry.get(model);
    }
}
