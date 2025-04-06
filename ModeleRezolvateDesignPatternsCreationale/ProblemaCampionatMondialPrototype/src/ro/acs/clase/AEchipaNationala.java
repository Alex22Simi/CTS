package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class AEchipaNationala implements Cloneable{
    protected String numeEchipa;
    protected List<String> listaJucatori;
    public abstract void printareEchipaListaDeJoc();
    public abstract void addJucatorNou(String jucatorNou);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AEchipaNationala{");
        sb.append("numeEchipa='").append(numeEchipa).append('\'');
        sb.append(", listaJucatori=").append(listaJucatori);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        AEchipaNationala echipaClonata = (AEchipaNationala) super.clone();
        echipaClonata.numeEchipa = this.numeEchipa;
        echipaClonata.listaJucatori = new ArrayList<>(this.listaJucatori);
        return echipaClonata;
    }

}
