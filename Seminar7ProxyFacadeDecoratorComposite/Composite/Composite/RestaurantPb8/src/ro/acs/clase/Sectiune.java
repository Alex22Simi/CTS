package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IStructura{
    private String nume;
    private List<IStructura> lista;//care contie fie subsectiuni fie item

    public Sectiune(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public Sectiune setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public List<IStructura> getLista() {
        return lista;
    }

    public Sectiune setLista(List<IStructura> lista) {
        this.lista = lista;
        return this;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectiune " + this.nume + " are urmatoarele subsectiuni sau itemuri: ");
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sectiune{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}
