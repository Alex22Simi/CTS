package ro.acs.clase;

import java.util.ArrayList;

public class ContractSportiv extends AContract{
     ContractSportiv() {
        super.tip = "Sportiv";
        super.listaClauze = new ArrayList<>();
        listaClauze.add("Mentinere liga 1.");
        listaClauze.add("Calificare in optimi in Cupa.");
    }

    @Override
    public void printare() {
        System.out.println("Acest contract este de tipul: " + super.tip);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        AContract contractClona = (AContract) super.clone();
        contractClona.tip = this.tip;
        contractClona.listaClauze = new ArrayList<>(this.listaClauze);
        return contractClona;
    }

    @Override
    public void addClauzaPersonalizata(String clauzaNoua) {
        listaClauze.add(clauzaNoua);
    }
}
