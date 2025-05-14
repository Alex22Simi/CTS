package ro.acs.clase;

public abstract class AbstractAnunt {
    protected AbstractAnunt urmator;
   public abstract void trimiteAnunt(Client client);

    public AbstractAnunt setUrmator(AbstractAnunt urmator) {
        this.urmator = urmator;
        return this;
    }
}
