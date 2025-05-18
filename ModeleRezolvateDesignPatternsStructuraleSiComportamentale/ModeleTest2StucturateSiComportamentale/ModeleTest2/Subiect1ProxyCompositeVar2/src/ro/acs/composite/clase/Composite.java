package ro.acs.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Composite extends AbstractVirus{
    private String nume;
    private int gradDeRaspandire;
    private boolean stareAlerta;
    private List<AbstractVirus> lista;

    public Composite(String nume, int gradDeRaspandire, boolean stareAlerta) {
        this.nume = nume;
        this.gradDeRaspandire = gradDeRaspandire;
        this.stareAlerta = stareAlerta;
        this.lista = new ArrayList<>();
    }

    @Override
    public void afiseazaInfo() {
        System.out.println(this.nume + " are urmatoarele componente: ");
        for(AbstractVirus virus : lista) {
            virus.afiseazaInfo();
        }
    }

    @Override
    public void addElement(AbstractVirus virus) {
        lista.add(virus);
    }

    @Override
    public void removeElement(AbstractVirus virus) {
        lista.remove(virus);
    }

    @Override
    public AbstractVirus getCopil(int index) {
        return lista.get(index);
    }

    @Override
    public int getTotalCases() {
        int nrCazuri = 0;
        for(AbstractVirus virus : lista) {
            nrCazuri += virus.getTotalCases();
        }
        return nrCazuri;
    }
}
