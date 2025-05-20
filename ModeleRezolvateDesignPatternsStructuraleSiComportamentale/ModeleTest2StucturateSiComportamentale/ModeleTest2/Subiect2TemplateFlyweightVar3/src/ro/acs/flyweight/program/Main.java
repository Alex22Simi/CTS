package ro.acs.flyweight.program;

import ro.acs.flyweight.clase.ERecomandari;
import ro.acs.flyweight.clase.RecomandareFactory;
import ro.acs.flyweight.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta1 = new Reteta("Alex", "Racit");
        Reteta reteta2 = new Reteta("Alin", "Gripa");

        RecomandareFactory recomandareFactory = new RecomandareFactory();
        recomandareFactory.getRecomandari(ERecomandari.SANATATE_GENERALA).printeaza(reteta1);
        System.out.println();
        recomandareFactory.getRecomandari(ERecomandari.SANATATE_GENERALA).printeaza(reteta2);
    }
}
