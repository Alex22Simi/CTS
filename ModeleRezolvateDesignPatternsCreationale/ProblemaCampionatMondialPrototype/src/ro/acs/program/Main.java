package ro.acs.program;


import ro.acs.clase.AEchipaNationala;
import ro.acs.clase.PrototypeEchipeFactory;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        AEchipaNationala echipaNoua = PrototypeEchipeFactory.getPrototipEchipa("Brazilia");
        echipaNoua.addJucatorNou("Pele");
        System.out.println(echipaNoua.toString());
        AEchipaNationala echipaNoua2 = PrototypeEchipeFactory.getPrototipEchipa("Brazilia");
        System.out.println(echipaNoua2.toString());

        System.out.println();


        AEchipaNationala echipaNoua3 = PrototypeEchipeFactory.getPrototipEchipa("Argentina");
        echipaNoua3.addJucatorNou("Sanchez");
        System.out.println(echipaNoua3.toString());
        AEchipaNationala echipaNoua4 = PrototypeEchipeFactory.getPrototipEchipa("Argentina");
        System.out.println(echipaNoua4.toString());

        System.out.println();


        AEchipaNationala echipaNoua5 = PrototypeEchipeFactory.getPrototipEchipa("Germania");
        echipaNoua5.addJucatorNou("Rudiger");
        System.out.println(echipaNoua5.toString());
        AEchipaNationala echipaNoua6 = PrototypeEchipeFactory.getPrototipEchipa("Germania");
        System.out.println(echipaNoua6.toString());
    }
}