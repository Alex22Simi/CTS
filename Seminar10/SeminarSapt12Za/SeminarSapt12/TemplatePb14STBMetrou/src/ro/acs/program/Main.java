package ro.acs.program;

import ro.acs.clase.AMetrou;
import ro.acs.clase.Metrou;
import ro.acs.clase.MetrouSpecial;

public class Main {
    public static void main(String[] args) {
        AMetrou metrou = new Metrou(2);
        AMetrou metrouSpecial = new MetrouSpecial();

        metrou.circulaTur();
        System.out.println();
        metrou.circulaRetur();
        System.out.println();
        metrouSpecial.circulaTur();
        System.out.println();
        metrouSpecial.circulaRetur();
    }
}