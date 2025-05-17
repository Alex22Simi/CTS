package ro.acs.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Composite extends AbstractProdus{
    private String nume;
    private List<AbstractProdus> lista;

    public Composite(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    @Override
    public void getInfo() {
        System.out.println(this.nume + " are in componenta urmatoarele: ");
        for(AbstractProdus produs : lista) {
            produs.getInfo();
        }
    }

    @Override
    public int getNrBucati() {
        int nrTotal = 0;
        for(IProdus produs : lista) {
            nrTotal += produs.getNrBucati();
        }
        return nrTotal;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public void addElement(AbstractProdus produs) {
        lista.add(produs);
    }

    @Override
    public void removeElement(AbstractProdus produs) {
       lista.remove(produs);
    }

    @Override
    public AbstractProdus getCopil(int index) {
       return lista.get(index);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Composite{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}
