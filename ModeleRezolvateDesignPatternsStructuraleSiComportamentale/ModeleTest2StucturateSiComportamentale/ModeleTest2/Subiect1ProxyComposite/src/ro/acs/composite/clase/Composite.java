package ro.acs.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Composite implements  INod{
    private String nume;
    private int gradDeRaspandire;
    private boolean stareDeAlerta;
    private List<INod> lista;

    public Composite(String nume, int gradDeRaspandire, boolean stareDeAlerta) {
        this.nume = nume;
        this.gradDeRaspandire = gradDeRaspandire;
        this.stareDeAlerta = stareDeAlerta;
        this.lista = new ArrayList<>();
    }

    @Override
    public void afiseazaInfo() {
        System.out.println(this.nume + " are urmatoarele componente: ");
        for(INod nod : lista) {
            nod.afiseazaInfo();
        }
    }

    @Override
    public void adaugaNod(INod nod) {
        lista.add(nod);
    }

    @Override
    public void stergeNod(INod nod) {
        lista.remove(nod);
    }

    @Override
    public INod getNodCopil(int index) {
        return lista.get(index);
    }

    @Override
    public int getTotalCases() {
        int nrCazuri = 0;
        for(INod nod : lista) {
            nrCazuri += nod.getTotalCases();
        }
        return nrCazuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Composite{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", gradDeRaspandire=").append(gradDeRaspandire);
        sb.append(", stareDeAlerta=").append(stareDeAlerta);
        sb.append(", lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}
