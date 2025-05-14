package ro.acs.clase;

public class VerificareGravitate extends AbstractInternare{
    @Override
    public void verifica(Pacient pacient) {
        if(pacient.getGravitate() < 3) {
            System.out.println("Pacientul " + pacient.getNume() + " nu trebuie internat");
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " trebuie sa fie internat.");
            if(urmator != null) {
                urmator.verifica(pacient);
            }
        }
    }
}


