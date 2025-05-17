package ro.acs.decorator.clase;

public class AsbtractDecorator extends AbstractMagazin{
    private AbstractMagazin magazin;

    public AsbtractDecorator(AbstractMagazin magazin) {
        this.magazin = magazin;
    }

    @Override
    public double calculeazaTotal(Client client, Comanda comanda) {
        return magazin.calculeazaTotal(client, comanda);
    }
}
