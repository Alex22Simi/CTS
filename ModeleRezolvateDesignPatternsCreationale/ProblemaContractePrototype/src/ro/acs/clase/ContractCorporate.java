package ro.acs.clase;

import java.util.ArrayList;

public class ContractCorporate extends AContract{
     ContractCorporate() {
        this.tip = "Corporate";
        this.listaClauze = new ArrayList<>();
        listaClauze.add("Clauza 1 Corporate");
        listaClauze.add("Clauza 2 Corporate");
    }

    @Override
    public void printare() {
        System.out.println("Contractul de tip " + this.tip);
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
