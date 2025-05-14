package ro.acs.clase;

public class Salon extends AbstractInternare{
    private int nrPaturiLibere;

    public Salon(int nrPaturiLibere) {
        this.nrPaturiLibere = nrPaturiLibere;
    }

    @Override
    public void verifica(Pacient pacient) {
        if(nrPaturiLibere <= 0) {
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat deoarece nu mai sunt locuri.");
        } else  {
            System.out.println("Pacientul " + pacient.getNume() + " a fost internat.");
            this.nrPaturiLibere--;
            System.out.println("Paturi rămase: " + nrPaturiLibere);
        }
    }
}
