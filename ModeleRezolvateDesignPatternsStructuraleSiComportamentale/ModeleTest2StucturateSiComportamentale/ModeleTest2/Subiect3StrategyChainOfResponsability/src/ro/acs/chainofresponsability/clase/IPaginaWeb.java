package ro.acs.chainofresponsability.clase;

import java.util.ArrayList;

public interface IPaginaWeb {

    ArrayList<Item> getListaObiecte();
    void incarcaPaginaWeb();
}
