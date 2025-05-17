package ro.acs.decorator.clase;

import java.util.List;

public class Produs implements IProdus{
    private String nume;
    private int pret;
    private List<String> ingrediente;

    public Produs(String nume, int pret, List<String> ingrediente) {
        this.nume = nume;
        this.pret = pret;
        this.ingrediente = ingrediente;
    }

    @Override
    public void getDescriereIngrediente() {
        System.out.println("Produsul " + this.nume + " are urmatoarele ingrediente: ");
        for(String ingredient : ingrediente) {
            System.out.println(ingredient);
        }
    }

    @Override
    public float getPret() {
        return this.pret;
    }

    @Override
    public String getNume() {
        return nume;
    }
}
