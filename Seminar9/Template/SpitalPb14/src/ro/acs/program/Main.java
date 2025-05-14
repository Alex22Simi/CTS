package ro.acs.program;


import ro.acs.clase.Pacient;
import ro.acs.clase.SpitalPrivat;
import ro.acs.clase.SpitalPublic;
import ro.acs.clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {
        Pacient alex = new Pacient("Alex", 4);
        TemplateInternare spitalPublic = new SpitalPublic("Spitalul judetean");
        TemplateInternare spitalPrivat = new SpitalPrivat();

        spitalPublic.internare(alex);
        System.out.println();
        spitalPrivat.internare(alex);

    }
}