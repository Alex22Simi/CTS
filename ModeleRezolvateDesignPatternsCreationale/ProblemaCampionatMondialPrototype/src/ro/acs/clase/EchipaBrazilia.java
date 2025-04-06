package ro.acs.clase;

import java.util.ArrayList;

public class EchipaBrazilia extends AEchipaNationala{
     EchipaBrazilia() {
        this.numeEchipa = "Brazilia";
        this.listaJucatori = new ArrayList<>();
        this.listaJucatori.add("Neymar JR.");
        this.listaJucatori.add("Raphinha");
        this.listaJucatori.add("Vinicius");
    }

    @Override
    public void printareEchipaListaDeJoc() {
        System.out.println("Pe lista de joc se printeaza si echipa " + this.numeEchipa);
    }

    @Override
    public void addJucatorNou(String jucatorNou) {
        listaJucatori.add(jucatorNou);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       AEchipaNationala echipaClonata = (AEchipaNationala) super.clone();
        echipaClonata.numeEchipa = this.numeEchipa;
        echipaClonata.listaJucatori = new ArrayList<>(this.listaJucatori);
        return echipaClonata;
    }

}
