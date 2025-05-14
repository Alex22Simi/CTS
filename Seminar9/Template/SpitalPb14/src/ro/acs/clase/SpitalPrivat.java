package ro.acs.clase;

public class SpitalPrivat extends TemplateInternare{
    @Override
    int dificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void disponibilitateSalon() {
        System.out.println("Avem paturi.");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pentru pacientul " + pacient.getNume() + " s-a emis fisa de internare.");
    }
}
