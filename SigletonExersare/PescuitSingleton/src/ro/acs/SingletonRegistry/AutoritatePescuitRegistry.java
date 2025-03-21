package ro.acs.SingletonRegistry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuitRegistry {
    private String denumire;
    private String webSite;
    private int nrAngajati;
    private static AutoritatePescuitRegistry instance = null;
    private Map<String, Autoritate> registry = new HashMap<>();

    private AutoritatePescuitRegistry(String denumire, String webSite, int nrAngajati) {
        this.denumire = denumire;
        this.webSite = webSite;
        this.nrAngajati = nrAngajati;
    }

    public synchronized static AutoritatePescuitRegistry getInstance(String denumire, String webSite, int nrAngajati) {
        if(instance == null) {
            instance = new AutoritatePescuitRegistry(denumire, webSite, nrAngajati);
        }
        return instance;
    }

    public Autoritate emiteAutorizatie(String numePersoana) {
        if(!registry.containsKey(numePersoana)) {
            registry.put(numePersoana, new Autoritate(numePersoana, new Date().toString(), registry.size() + 1));
        }
        return registry.get(numePersoana);
    }
}
