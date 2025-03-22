package ro.acs.clase;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AgeTurRegistry {
    private int cifraAfaceri;
    private int nrAngajati;
    private static AgeTurRegistry instance = null;
    private Map<Integer, Pachet> registry = new HashMap<>();

    private AgeTurRegistry(int cifraAfaceri, int nrAngajati) {
        this.cifraAfaceri = cifraAfaceri;
        this.nrAngajati = nrAngajati;
    }

    public static AgeTurRegistry getInstance(int cifraAfaceri, int nrAngajati) {
        if(instance == null) {
            instance = new AgeTurRegistry(cifraAfaceri, nrAngajati);
        }
        return instance;
    }

    public Pachet emitePachet(int idPachet) {
        if(!registry.containsKey(idPachet)) {
            registry.put(idPachet, new Pachet(idPachet, new Date().toString(), registry.size()+1));
        }
        return registry.get(idPachet);
    }
}
