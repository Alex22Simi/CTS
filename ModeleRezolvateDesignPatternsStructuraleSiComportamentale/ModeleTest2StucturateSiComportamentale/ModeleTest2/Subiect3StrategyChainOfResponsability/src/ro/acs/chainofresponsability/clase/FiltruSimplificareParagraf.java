package ro.acs.chainofresponsability.clase;

import java.util.ArrayList;

public class FiltruSimplificareParagraf extends AbstractFiltru{
    @Override
    public ArrayList<Item> filtrare(ArrayList<Item> itemi) {
        ArrayList<Item> rezultat = new ArrayList<>(itemi);
        for(Item item : rezultat)  {
            if(item instanceof Paragraf) {
                ((Paragraf) item).setEsteBolduit(false);
                ((Paragraf) item).setEsteItalic(false);
                ((Paragraf) item).setCuloare("Negru");
            }
        }
        if(getUrmator() != null) {
            return getUrmator().filtrare(rezultat);
        } else {
            return rezultat;
        }
    }
}
