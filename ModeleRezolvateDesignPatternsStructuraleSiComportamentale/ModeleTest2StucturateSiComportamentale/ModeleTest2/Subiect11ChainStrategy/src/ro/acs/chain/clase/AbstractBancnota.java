package ro.acs.chain.clase;

public abstract class AbstractBancnota {
    private AbstractBancnota urmatoare;

    public void setUrmatoare(AbstractBancnota urmatoare) {
        this.urmatoare = urmatoare;
    }

    public AbstractBancnota getUrmatoare() {
        return urmatoare;
    }

    public abstract void retrage(int suma);
}
