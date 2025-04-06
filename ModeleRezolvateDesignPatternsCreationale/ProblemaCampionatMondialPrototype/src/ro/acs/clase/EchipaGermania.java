package ro.acs.clase;

import java.util.ArrayList;

public class EchipaGermania extends AEchipaNationala{
    EchipaGermania() {
        this.numeEchipa = "Germania";
        this.listaJucatori = new ArrayList<>();
        listaJucatori.add("Muller");
        listaJucatori.add("Neuer");
        listaJucatori.add("Gotze");
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
