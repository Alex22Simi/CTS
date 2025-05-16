package ro.acs.decorator.clase;

import java.util.List;

public class Produs implements IProdus{
    private String nume;
    private int pret;
    private List<String> listaIngrediente;

    public Produs(String nume, int pret, List<String> listaIngrediente) {
        this.nume = nume;
        this.pret = pret;
        this.listaIngrediente = listaIngrediente;
    }


    @Override
    public void getDescriereIngrediente() {
        for(String ingredient : listaIngrediente) {
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
