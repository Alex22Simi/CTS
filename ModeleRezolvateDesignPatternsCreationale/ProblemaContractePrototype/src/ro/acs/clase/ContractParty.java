package ro.acs.clase;

import java.util.ArrayList;

public class ContractParty extends AContract{
     ContractParty() {
        super.tip = "Party";
        super.listaClauze = new ArrayList<>();
        listaClauze.add("Clauza Party 1.");
        listaClauze.add("Clauza Party 2.");
    }

    @Override
    public void printare() {
        System.out.println("Contractul de tip " + super.tip);
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
