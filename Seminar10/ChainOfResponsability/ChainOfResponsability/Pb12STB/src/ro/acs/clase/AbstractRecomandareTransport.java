package ro.acs.clase;

public abstract class AbstractRecomandareTransport {
    protected AbstractRecomandareTransport urmatorul;
    public abstract void recomanda(float distanta);

    public AbstractRecomandareTransport setUrmatorul(AbstractRecomandareTransport urmatorul) {
        this.urmatorul = urmatorul;
        return this;
    }
}
