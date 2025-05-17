package ro.acs.chainofresponsability.clase;

import java.util.ArrayList;

public class StergereImagine extends AbstractFiltru{
    @Override
    public ArrayList<Item> filtrare(ArrayList<Item> itemi) {
       ArrayList<Item> rezultat = new ArrayList<>();
       for(Item item : itemi) {
           if(!(item instanceof Imagine)) {
               rezultat.add(item);
           }
       }
       if(getUrmator() != null) {
           return getUrmator().filtrare(rezultat);
       } else {
           return rezultat;
       }
    }
}
