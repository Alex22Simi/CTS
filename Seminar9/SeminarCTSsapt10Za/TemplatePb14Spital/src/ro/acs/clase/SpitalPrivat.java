package ro.acs.clase;

public class SpitalPrivat extends TemplateInternare{
    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificateDisponibilitate() {
        System.out.println("Avem paturi suficiente.");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pentru pacientul " + pacient.getNume() + " a fost emisa fisa de internare.");
    }
}
