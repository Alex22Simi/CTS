package ro.acs.clase;

public abstract class PrintareFelicitareDecorator implements Nota{
    private Nota notaDePlata;

    public PrintareFelicitareDecorator(Nota notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printare() {
        notaDePlata.printare();
        printareFelicitare();
    }
    protected abstract void printareFelicitare();
}
