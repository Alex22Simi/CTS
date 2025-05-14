package ro.acs.program;

import ro.acs.clase.Pacient;
import ro.acs.clase.SpitalPrivat;
import ro.acs.clase.SpitalPublic;
import ro.acs.clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Marcel", 5);
        TemplateInternare spital = new SpitalPublic("Spital");
        spital.internare(pacient1);

        TemplateInternare spitalPrivat = new SpitalPrivat();
        spitalPrivat.internare(pacient1);
    }
}