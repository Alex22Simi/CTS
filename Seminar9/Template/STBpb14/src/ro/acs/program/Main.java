package ro.acs.program;

import ro.acs.clase.TemplateTraseu;
import ro.acs.clase.Tramvai;

public class Main {
    public static void main(String[] args) {
        TemplateTraseu tramvai = new Tramvai();
        tramvai.parcurgeTraseu(true);
        System.out.println();
        tramvai.parcurgeTraseu(false);
    }
}