package ro.acs.chainofresponsability.program;

import ro.acs.chainofresponsability.clase.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        PaginaWeb paginaWeb1 = new PaginaWeb();
        Item imagine = new Imagine("Imagine cu o pisica", "pisica.png");
        Item paragraf = new Paragraf("Paragraf cu descrierea paginii", true, false, "Mov");

        paginaWeb1.getListaObiecte().add(imagine);
        paginaWeb1.getListaObiecte().add(paragraf);

        paginaWeb1.incarcaPaginaWeb();
        for(Item item : paginaWeb1.getListaObiecte()) {
            item.getDescriere();
        }

       AbstractFiltru filtruStrergere = new StergereImagine();
       AbstractFiltru filtruParagraf = new FiltruSimplificareParagraf();

        System.out.println();
        filtruStrergere.setUrmator(filtruParagraf);

        items = filtruStrergere.filtrare(paginaWeb1.getListaObiecte());
        for(Item item : items) {
            System.out.println(item);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        ArrayList<Item> items2 = new ArrayList<>();
        PaginaWeb paginaWeb2 = new PaginaWeb();
        Item imagine2 = new Imagine("Imagine cu un caine", "caine.png");
        Item paragraf2 = new Paragraf("Paragraf cu descrierea paginii caine", true, true, "Albastru");

        paginaWeb2.getListaObiecte().add(imagine2);
        paginaWeb2.getListaObiecte().add(paragraf2);

        paginaWeb2.incarcaPaginaWeb();
        for(Item item2 : paginaWeb2.getListaObiecte()) {
            item2.getDescriere();
        }

        AbstractFiltru filtruStrergere2 = new StergereImagine();
        AbstractFiltru filtruParagraf2 = new FiltruSimplificareParagraf();

        System.out.println();
        filtruParagraf2.setUrmator(filtruStrergere2);

        items2 = filtruStrergere2.filtrare(paginaWeb2.getListaObiecte());
        for(Item item2 : items2) {
            System.out.println(item2);
        }
    }
}
