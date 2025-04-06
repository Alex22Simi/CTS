package ro.acs.program;


import ro.acs.clase.APantof;
import ro.acs.clase.EStilPantof;
import ro.acs.clase.PrototypePantofFactory;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        APantof pantof1 = PrototypePantofFactory.getPrototipuri(EStilPantof.Punk);
        pantof1.addMesaj("Nou");
        System.out.println(pantof1.toString());
        APantof pantof6 = PrototypePantofFactory.getPrototipuri(EStilPantof.Punk);
        System.out.println(pantof6.toString());


        APantof pantof2 = PrototypePantofFactory.getPrototipuri(EStilPantof.Pop);
        pantof2.setMarimePantof(38);
        System.out.println(pantof2.toString());
        APantof pantof7 = PrototypePantofFactory.getPrototipuri(EStilPantof.Pop);
        System.out.println(pantof7.toString());

        APantof pantof3 = PrototypePantofFactory.getPrototipuri(EStilPantof.Rock);
        pantof3.setCuloare("Mov");
        System.out.println(pantof3.toString());
        APantof pantof8 = PrototypePantofFactory.getPrototipuri(EStilPantof.Rock);
        System.out.println(pantof8.toString());
    }
}