package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class DepartamentComposite implements IStructura{
    private String nume;
    private List<IStructura> lista;

    public DepartamentComposite(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>(); //lista e goala la inceput
    }

    public String getNume() {
        return nume;
    }

    public DepartamentComposite setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public List<IStructura> getLista() {
        return lista;
    }

    public DepartamentComposite setLista(List<IStructura> lista) {
        this.lista = lista;
        return this;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Departamentul " + this.nume + " are urmatoarele sectii ");
        for(IStructura structura : lista) {
            structura.descriereStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura structura) {
        lista.add(structura);
    }

    @Override
    public void stergeNod(IStructura structura) {
        lista.remove(structura);
    }

    @Override
    public IStructura getCopilNod(int index) {
        return lista.get(index);
    }
}
