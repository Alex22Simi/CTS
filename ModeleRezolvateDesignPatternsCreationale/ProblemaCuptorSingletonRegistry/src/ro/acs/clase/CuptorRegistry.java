package ro.acs.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuptorRegistry extends ACuptor{
    private int id;
    private int gradeMaxime;
    private List<Comanda> listaComenzi;
    private static Map<Integer, CuptorRegistry> registry = null;

    static {
        registry = new HashMap<>();
        registry.put(1, new CuptorRegistry(1, 350));
        registry.put(2, new CuptorRegistry(2, 300));
        registry.put(3, new CuptorRegistry(3, 500));
        registry.put(4, new CuptorRegistry(4, 200));
    }

    private CuptorRegistry(int id, int gradeMaxime) {
        this.id = id;
        this.gradeMaxime = gradeMaxime;
        this.listaComenzi = new ArrayList<>();
    }

    @Override
    public int getGradeMaxime() {
        return this.gradeMaxime;
    }

    @Override
    public int getTimpAsteptare() {
        int timp = 0;
        for(Comanda c : listaComenzi){
            timp += c.getTimpGatire();
        }
        return timp;
    }

    public static void afisareComenziAsteptare() {
        for(CuptorRegistry c : registry.values()) {
            System.out.println(c.toString());
        }
    }

    public static void addComanda(Comanda c) {
        CuptorRegistry cuptorMinim = null;
        int timpMinim = Integer.MAX_VALUE;
        for (CuptorRegistry cuptor : registry.values()) {
            if(cuptor.getGradeMaxime() >= c.getGradeGatire()) {
                int timpCurent = cuptor.getTimpAsteptare();
                if(timpCurent < timpMinim) {
                    timpMinim = timpCurent;
                    cuptorMinim = cuptor;
                }
            }
        }
        if(cuptorMinim != null) {
            cuptorMinim.listaComenzi.add(c);
        } else {
            System.out.println("Nu avem cuptor cu atat de multe grade!");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuptorRegistry{");
        sb.append("id=").append(id);
        sb.append(", gradeMaxime=").append(gradeMaxime);
        sb.append(", listaComenzi=").append(listaComenzi);
        sb.append('}');
        return sb.toString();
    }
}
