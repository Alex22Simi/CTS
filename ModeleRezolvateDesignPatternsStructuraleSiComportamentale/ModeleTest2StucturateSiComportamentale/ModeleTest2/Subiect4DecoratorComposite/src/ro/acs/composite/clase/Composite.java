package ro.acs.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Composite extends AbstractNod{
    private String nume;
   private List<IProdus> lista;

    public Composite(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }


    @Override
    public void addElement(IProdus nod) {
       lista.add((AbstractNod) nod);
    }

    @Override
    public void removeElement(IProdus nod) {
        lista.remove(nod);
    }

    @Override
    public IProdus getElement(int index) {
        return lista.get(index);
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println(this.nume + " are in componenta: ");
        for(IProdus produs : lista) {
            produs.afiseazaInformatii();
        }
    }

    @Override
    public int getPret() {
        int pret = 0;
        for(IProdus produs : lista) {
            pret += produs.getPret();
        }
        return pret;
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
