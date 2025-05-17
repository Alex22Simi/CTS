package ro.acs.template.clase;

public abstract class AbstractPrimiriUrgente {
    protected Pacient pacient;
    protected abstract void programeazaLaMedicFamilie();
    protected abstract void interventieEchipaMedici();
    protected abstract void disponibilitateLocSpital();
    protected abstract void cautaLocSpitalStatApropiat();
    public final void gestionareCaz(Pacient pacient) {
        this.pacient = pacient;
        if(!pacient.isEsteInStareGrava()) {
            programeazaLaMedicFamilie();
        } else {
            interventieEchipaMedici();
            disponibilitateLocSpital();
            cautaLocSpitalStatApropiat();
        }
    }
}
