package ro.acs.decorator.clase;

public class DecoratorProdus implements IProdus{
    private IProdus produsDecorat;

    public DecoratorProdus(IProdus produsDecorat) {
        this.produsDecorat = produsDecorat;
    }


    @Override
    public void getDescriereIngrediente() {
        produsDecorat.getDescriereIngrediente();
    }

    @Override
    public float getPret() {
        return produsDecorat.getPret();
    }

    @Override
    public String getNume() {
        return produsDecorat.getNume();
    }
}
