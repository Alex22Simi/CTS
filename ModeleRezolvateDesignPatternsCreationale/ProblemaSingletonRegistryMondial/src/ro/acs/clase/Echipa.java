package ro.acs.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Echipa implements IEchipa{
    private int id;
    private int nrTrofee;
    private String numeEchipa;
    private  List<String> listaJucatori;
    private static Map<Integer, Echipa> registry = null;
    static {
        List<String> lj1 = new ArrayList<>();
        lj1.add("Messi");
        lj1.add("Martinez");
        Echipa e1 = new Echipa(1, 10, "Argentina", lj1);
        registry = new HashMap<>();
        registry.put(1, e1);

        List<String> lj2 = new ArrayList<>();
        lj2.add("Neymar");
        lj2.add("Vinicius");
        Echipa e2 = new Echipa(2, 8, "Brazilia", lj2);
        registry = new HashMap<>();
        registry.put(2, e2);
    }


    private Echipa(int id, int nrTrofee, String numeEchipa, List<String> listaJucatori) {
        this.id = id;
        this.nrTrofee = nrTrofee;
        this.numeEchipa = numeEchipa;
        this.listaJucatori = listaJucatori;
    }

    public static Map<Integer, Echipa> getRegistry() {
        return registry;
    }
    public static Echipa getInstancerRegistry(int id) {
        return registry.get(id);
    }

    @Override
    public int getTrofeee() {
        return this.nrTrofee;
    }

    @Override
    public String getNume() {
        return this.numeEchipa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Echipa{");
        sb.append("id=").append(id);
        sb.append(", nrTrofee=").append(nrTrofee);
        sb.append(", numeEchipa='").append(numeEchipa).append('\'');
        sb.append(", listaJucatori=").append(listaJucatori);
        sb.append('}');
        return sb.toString();
    }
}
