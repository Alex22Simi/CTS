package ro.acs.clase;

public abstract class AbstractInternare {
    protected AbstractInternare urmator;
    public abstract void verifica(Pacient pacient);

    public AbstractInternare setUrmator(AbstractInternare urmator) {
        this.urmator = urmator;
        return this;
    }
}

