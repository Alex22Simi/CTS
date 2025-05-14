package ro.acs.clase;

public abstract class TemplateInternare {
   public final  void internare(Pacient pacient) {
        if(analizareDificultate(pacient) < 3) {
            System.out.println("Nu necesita internare.");
        } else {
            verificateDisponibilitate();
            emitereFisa(pacient);

        }
    };
     abstract  int analizareDificultate(Pacient pacient);
    abstract  void verificateDisponibilitate();
    abstract  void emitereFisa(Pacient pacient);
}
