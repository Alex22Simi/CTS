package ro.acs.program;


import ro.acs.clase.AContract;
import ro.acs.clase.ContractParty;
import ro.acs.clase.PrototypeContractFactory;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        AContract contractNou = PrototypeContractFactory.getPrototipContract("Sportiv");
        contractNou.addClauzaPersonalizata("Calificarea in Europa League.");
        System.out.println(contractNou.toString());

        AContract contractSportiv2 = PrototypeContractFactory.getPrototipContract("Sportiv");
        System.out.println(contractSportiv2.toString());

        AContract contractNou2 = PrototypeContractFactory.getPrototipContract("Corporate");
        System.out.println(contractNou2.toString());

        AContract contractNou3 = PrototypeContractFactory.getPrototipContract("Party");
        System.out.println(contractNou3.toString());
    }
}