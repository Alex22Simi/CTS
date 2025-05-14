package ro.acs.clase;

public abstract class TemplateInternare {
    abstract int dificultate(Pacient pacient);
    abstract void disponibilitateSalon();
    abstract void emitereFisa(Pacient pacient);

    public final void internare(Pacient pacient) {
        if(dificultate(pacient) < 3) {
            System.out.println("Nu are nevoie de internare,");
        } else {
            disponibilitateSalon();
            emitereFisa(pacient);
        }
    }
}
