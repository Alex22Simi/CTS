package ro.acs.chain.program;

import ro.acs.chain.clase.AbstractBancnota;
import ro.acs.chain.clase.Bancnota10;
import ro.acs.chain.clase.Bancnota20;
import ro.acs.chain.clase.Bancnota50;

public class Main {
    public static void main(String[] args) {
        AbstractBancnota bancnota50 = new Bancnota50(2);//100 lei
        AbstractBancnota bancnota20 = new Bancnota20(4);//80 lei
        AbstractBancnota bancnota10 = new Bancnota10(3);//30 lei

        bancnota50.setUrmatoare(bancnota20);
        bancnota20.setUrmatoare(bancnota10);

        System.out.println("------------RETRAGERE 130 lei------------");
        bancnota50.retrage(130);

        System.out.println("------------RETRAGERE 180 lei------------");
        bancnota50.retrage(180);
    }
}