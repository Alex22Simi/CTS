package ro.acs.program;


import ro.acs.clase.Nota;
import ro.acs.clase.NotaDePlata;
import ro.acs.clase.NotaDePlataCraciun;
import ro.acs.clase.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args) {
        Nota notaDePlata = new NotaDePlata(500.5f);
        notaDePlata.printare();
        System.out.println();
        Nota notaDecorata = new NotaDePlataRevelion(notaDePlata);
        notaDecorata.printare();
        System.out.println();

        Nota notaDecorataCraciun = new NotaDePlataCraciun(notaDePlata);
        Nota nota2 = new NotaDePlataCraciun(notaDecorata);
        nota2.printare();
        System.out.println();
        notaDecorataCraciun.printare();
    }
}