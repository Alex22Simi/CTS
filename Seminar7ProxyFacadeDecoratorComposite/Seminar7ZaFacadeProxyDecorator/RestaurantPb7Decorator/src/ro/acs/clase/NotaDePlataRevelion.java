package ro.acs.clase;

public class NotaDePlataRevelion extends PrintareFelicitareDecorator{
    public NotaDePlataRevelion(Nota notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani!!!");
    }
}
