package ro.acs.main;

import ro.acs.SigletonRegistry.AutoritateMasiniRegistry;
import ro.acs.SigletonRegistry.Reglementare;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritateMasiniRegistry autoritateMasiniRegistry = AutoritateMasiniRegistry.getInstance("Eu", "Eu.ro");
        Reglementare reglementare = autoritateMasiniRegistry.reglementareModel("BMW");
        System.out.println(reglementare.toString());
        Reglementare reglementare1 = autoritateMasiniRegistry.reglementareModel("BMW");
        System.out.println(reglementare1.toString());
        Reglementare reglementare2 = autoritateMasiniRegistry.reglementareModel("Dacia");
        System.out.println(reglementare2.toString());
    }

}
