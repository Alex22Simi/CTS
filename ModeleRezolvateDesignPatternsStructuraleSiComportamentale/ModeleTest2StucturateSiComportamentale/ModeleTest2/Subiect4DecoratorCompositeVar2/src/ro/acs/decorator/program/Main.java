package ro.acs.decorator.program;

import ro.acs.decorator.clase.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IProdus produsFaraSpecific = new Produs("Friptura", 23, List.of("Ulei", "Sare"));
        produsFaraSpecific.getDescriereIngrediente();
        System.out.println(produsFaraSpecific.getPret());

        System.out.println();
        IProdus produsItalienesc = new ProdusSpecificItalienesc(produsFaraSpecific, "Masline");
        produsItalienesc.getDescriereIngrediente();
        System.out.println(produsItalienesc.getPret());
        System.out.println();

        IProdus produsFaraSpecific2 = new Produs("Pizza", 35, List.of("Salam", "Masline", "Ciuperci"));
        IProdus produsSpecificSpaniol = new ProdusSpecificSpaniol(produsFaraSpecific2, "Sos spaniol");
        produsSpecificSpaniol.getDescriereIngrediente();
        System.out.println(produsItalienesc.getPret());
    }
}