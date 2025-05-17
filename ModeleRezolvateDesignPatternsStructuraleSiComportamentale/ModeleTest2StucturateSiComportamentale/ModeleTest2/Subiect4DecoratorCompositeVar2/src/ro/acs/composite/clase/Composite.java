package ro.acs.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Composite extends  AbstractNod{
    private String nume;
    private List<IProdus> lista;

    public Composite(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println(this.nume + " are urmatoarele componente: ");
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
    public void addElement(IProdus nod) {
        lista.add(nod);
    }

    @Override
    public void removeElement(IProdus nod) {
        lista.remove(nod);
    }

    @Override
    public IProdus getElement(int index) {
        return lista.get(index);
    }


}
