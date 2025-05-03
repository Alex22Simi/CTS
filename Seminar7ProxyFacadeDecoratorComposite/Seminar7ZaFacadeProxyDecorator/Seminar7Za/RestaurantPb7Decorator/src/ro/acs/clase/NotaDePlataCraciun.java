package ro.acs.clase;

public class NotaDePlataCraciun extends PrintareFelicitareDecorator{
    public NotaDePlataCraciun(Nota notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit!!!");
    }
}
