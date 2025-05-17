package ro.acs.flyweight.program;

import ro.acs.flyweight.clase.FactoryRecomandare;
import ro.acs.flyweight.clase.Recomandare;
import ro.acs.flyweight.clase.Reteta;
import ro.acs.flyweight.clase.TipRecomandare;

public class Main {
    public static void main(String[] args) {
        Reteta reteta1 = new Reteta("Alex", "Racit");
        Reteta reteta2 = new Reteta("Dani", "Durere gat");
        Reteta reteta3 = new Reteta("Mada", "Durere spate");
        Reteta reteta4 = new Reteta("Alin", "Durere cap");
        Reteta reteta5 = new Reteta("Cosmina", "Racit");
        Reteta reteta6 = new Reteta("Mircea", "Durere maini");
        Reteta reteta7 = new Reteta("Popescu", "Racit");
        Reteta reteta8 = new Reteta("Ionescu", "Durere nas");
        Reteta reteta9 = new Reteta("Simionescu", "Durere spate");
        Reteta reteta10 = new Reteta("Emil", "Racit");

        FactoryRecomandare recomandare = new FactoryRecomandare();
        recomandare.getRecomandare(TipRecomandare.SANATATE_GENERALA).printareReteta(reteta1);
        System.out.println();
        recomandare.getRecomandare(TipRecomandare.SANATATE_GENERALA).printareReteta(reteta2);
        System.out.println();
        recomandare.getRecomandare(TipRecomandare.NUTRITIE).printareReteta(reteta3);
        System.out.println();
        recomandare.getRecomandare(TipRecomandare.SPORT).printareReteta(reteta4);
        System.out.println();
        recomandare.getRecomandare(TipRecomandare.NUTRITIE).printareReteta(reteta5);
        System.out.println();
        recomandare.getRecomandare(TipRecomandare.SPORT).printareReteta(reteta6);
        System.out.println();
        recomandare.getRecomandare(TipRecomandare.SPORT).printareReteta(reteta7);
        System.out.println();
        recomandare.getRecomandare(TipRecomandare.SANATATE_GENERALA).printareReteta(reteta8);
        System.out.println();
        recomandare.getRecomandare(TipRecomandare.SPORT).printareReteta(reteta9);
        System.out.println();
        recomandare.getRecomandare(TipRecomandare.NUTRITIE).printareReteta(reteta10);




    }
}
