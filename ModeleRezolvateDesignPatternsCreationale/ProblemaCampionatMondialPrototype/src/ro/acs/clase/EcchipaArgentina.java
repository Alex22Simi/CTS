package ro.acs.clase;

import java.util.ArrayList;

public class EcchipaArgentina extends AEchipaNationala{
    EcchipaArgentina () {
        this.numeEchipa = "Argentina";
        this.listaJucatori = new ArrayList<>();
        listaJucatori.add("Messi");
        listaJucatori.add("Di Maria");
        listaJucatori.add("Martinez");
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
