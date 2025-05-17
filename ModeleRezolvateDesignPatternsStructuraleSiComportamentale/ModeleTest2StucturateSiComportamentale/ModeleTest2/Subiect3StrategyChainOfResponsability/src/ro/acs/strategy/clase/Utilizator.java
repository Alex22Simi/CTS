package ro.acs.strategy.clase;

import java.util.List;

public class Utilizator {
    private String nume;
    private IProdus produsStrategie;

    public Utilizator(String nume, IProdus produsStrategie) {
        this.nume = nume;
        this.produsStrategie = produsStrategie;
    }

    public void setProdusStrategie(IProdus produsStrategie) {
        this.produsStrategie = produsStrategie;
    }
     public void afiseazaListaProduseDupaStrategie(List<Produs> listaProduse) {
        if(produsStrategie != null) {
            listaProduse = produsStrategie.vizualizareProduse(listaProduse);
            for(Produs produs : listaProduse) {
                System.out.println("In lista se afla produsul: " + produs);
            }
        } else {
            System.out.println("Nu s-a ales nicio strategie.");
        }
     }
}
