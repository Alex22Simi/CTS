package ro.acs.clase;

public class SpitalPublic extends TemplateInternare{
    private String denumire;

    public SpitalPublic(String denumire) {
        this.denumire = denumire;
    }

    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificateDisponibilitate() {
        System.out.println("Nu avem paturi suficiente in spitalul " + this.denumire);
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pentru pacientul " + pacient.getNume() + " a fost emisa fisa de internare.");
    }
}
