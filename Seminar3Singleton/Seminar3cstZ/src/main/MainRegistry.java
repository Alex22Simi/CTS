package main;

import SingletonRegistry.AutoritatePescuit;
import SingletonRegistry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit =  AutoritatePescuit.getInstance();
        Autorizatie autorizatieGeorgeCosbuc = autoritatePescuit.emiteAutorizatie("George Cosbuc");
        System.out.println(autorizatieGeorgeCosbuc.toString());
        Autorizatie autorizatieGeorgeCosbuc2 = autoritatePescuit.emiteAutorizatie("George Cosbuc");
        System.out.println(autorizatieGeorgeCosbuc.toString());

    }
}
