package ro.acs.main;

import ro.acs.SingletonRegistry.AutoritatePescuitRegistry;
import ro.acs.SingletonRegistry.Autoritate;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuitRegistry autoritatePescuitRegistry = AutoritatePescuitRegistry.getInstance("RAPID", "RAPID.ro",1923);
        Autoritate autorizatie = autoritatePescuitRegistry.emiteAutorizatie("Alexandru");
        System.out.println(autorizatie.toString());
        Autoritate autorizatie2 = autoritatePescuitRegistry.emiteAutorizatie("Alin");
        System.out.println(autorizatie2.toString());
        Autoritate autorizatie3 = autoritatePescuitRegistry.emiteAutorizatie("Alin");
        System.out.println(autorizatie3.toString());
    }
}
