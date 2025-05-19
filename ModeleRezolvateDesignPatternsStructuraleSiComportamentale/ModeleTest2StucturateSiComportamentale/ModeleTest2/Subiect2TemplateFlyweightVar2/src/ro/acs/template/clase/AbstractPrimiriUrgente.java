package ro.acs.template.clase;

public abstract class AbstractPrimiriUrgente {
    protected Pacient pacient;
    protected abstract void programeazaLaMedicFamilie();
    protected abstract void interventieMedici();
    protected abstract void verificareDisponibiliatetLocSpital();
    protected abstract void cautaLocSpitalApropiat();

    public  final void primesteUrgenta(Pacient pacient) {
        this.pacient = pacient;
        if(!pacient.isEsteInStareGrava()) {
            programeazaLaMedicFamilie();
        } else {
            interventieMedici();
            verificareDisponibiliatetLocSpital();
            cautaLocSpitalApropiat();
        }
    }

}
