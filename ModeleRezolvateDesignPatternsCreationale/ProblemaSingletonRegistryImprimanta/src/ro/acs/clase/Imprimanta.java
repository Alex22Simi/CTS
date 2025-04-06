package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class Imprimanta extends AImprimanta{
    private int nivelToner;
    private boolean isColor;
    private int ip;
    private static Map<Integer, Imprimanta> registry = null;
    static {
        Imprimanta i1 = new Imprimanta(230, true, 1);
        Imprimanta i2 = new Imprimanta(200, false, 2);
        Imprimanta i3 = new Imprimanta(150, true, 3);


        registry = new HashMap<>();
        registry.put(1,i1);
        registry.put(2,i2);
        registry.put(3,i3);
    }

    public static Map<Integer, Imprimanta> getRegistry() {
        return registry;
    }
    public static Imprimanta getInstanceImprimanta(int id) {
        return registry.get(id);
    }

    private Imprimanta(int nivelToner, boolean isColor, int ip) {
        this.nivelToner = nivelToner;
        this.isColor = isColor;
        this.ip = ip;
    }

    @Override
    public int getNivelToner() {
        return this.nivelToner;
    }

    @Override
    public boolean isColor() {
        return this.isColor;
    }

    @Override
    public int getIP() {
        return this.ip;
    }
    public  static void printeaza(Document document, int paginaDeStart, int paginaStop, TipPrintare tip) {
        int nrPaginiPrintate = paginaStop - paginaDeStart;
        int nrToner = nrPaginiPrintate / 10 * 5;
        boolean isPrintat = false;
        for(Imprimanta i : registry.values()) {
            if (TipPrintare.COLOR == tip && i.isColor == true) {
                if (2 * nrToner < i.nivelToner) {
                    i.nivelToner -= 2 * nrToner;
                    System.out.println("Documentul " + document + " a fost printat!");
                    isPrintat = true;
                }
            } else if (TipPrintare.ALBNEGRU == tip && i.isColor == false) {
                if (nrToner < i.nivelToner) {
                    i.nivelToner -= nrToner;
                    System.out.println("Documentul " + document + " a fost printat!");
                    isPrintat = true;
                }
            }
        }
        if(isPrintat == false) {
            throw  new ExceptiePrintare("Documentul nu a putut sa fie printat!");
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imprimanta{");
        sb.append("nivelToner=").append(nivelToner);
        sb.append(", isColor=").append(isColor);
        sb.append(", ip=").append(ip);
        sb.append('}');
        return sb.toString();
    }
}
