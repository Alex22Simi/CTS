package ro.acs.chainofresponsability.clase;

import java.util.ArrayList;

public abstract class AbstractFiltru {
    private AbstractFiltru urmator;

    public void setUrmator(AbstractFiltru urmator) {
        this.urmator = urmator;
    }

    public AbstractFiltru getUrmator() {
        return urmator;
    }

    public abstract ArrayList<Item> filtrare(ArrayList<Item> itemi);
}
