package ro.acs.clase;

public abstract  class ARecomandaTransport {
    protected ARecomandaTransport urmator;

    public ARecomandaTransport setUrmator(ARecomandaTransport urmator) {
        this.urmator = urmator;
        return this;
    }

    public abstract void recomanda(int distanta);



}
