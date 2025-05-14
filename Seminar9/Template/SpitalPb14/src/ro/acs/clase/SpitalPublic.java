package ro.acs.clase;

public class SpitalPublic extends  TemplateInternare{
    private String numeSpital;

    public SpitalPublic(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    @Override
    int dificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void disponibilitateSalon() {
        System.out.println("Nu avem paturi suficiente in spitalul " + this.numeSpital);
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost mutat la alt spital.");
    }
}
