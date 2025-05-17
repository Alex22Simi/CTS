package ro.acs.chainofresponsability.clase;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPaginaWeb{
    private ArrayList<Item> listaItemuri;

    public PaginaWeb() {
        this.listaItemuri = new ArrayList<>();
    }

    @Override
    public ArrayList<Item> getListaObiecte() {
        return this.listaItemuri;
    }

    @Override
    public void incarcaPaginaWeb() {
        System.out.println("Pagina s-a incarcat.");
    }
}
