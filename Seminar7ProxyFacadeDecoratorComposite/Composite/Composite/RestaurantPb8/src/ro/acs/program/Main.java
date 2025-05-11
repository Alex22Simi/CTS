package ro.acs.program;


import ro.acs.clase.IStructura;
import ro.acs.clase.Item;
import ro.acs.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        IStructura meniu = new Sectiune("Meniu");
        IStructura starter = new Sectiune("Starter");
        IStructura bauturi = new Sectiune("Bauturi");
        IStructura desert = new Sectiune("Desert");

        Item bruschete = new Item("Bruschete");
        Item cafea = new Item("Cafea");
        Item suc = new Item("Suc");
        Item clatite = new Item("Clatite");

        meniu.adaugaNod(starter);
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(desert);

        starter.adaugaNod(bruschete);
        bauturi.adaugaNod(cafea);
        bauturi.adaugaNod(suc);
        desert.adaugaNod(clatite);

        meniu.descriereStructura();
        System.out.println();
        bauturi.descriereStructura();
        System.out.println();
        suc.descriereStructura();

        System.out.println();
        bauturi.stergeNod(cafea);
        bauturi.descriereStructura();

        System.out.println();
        System.out.println(meniu.getCopilNod(0));

    }
}