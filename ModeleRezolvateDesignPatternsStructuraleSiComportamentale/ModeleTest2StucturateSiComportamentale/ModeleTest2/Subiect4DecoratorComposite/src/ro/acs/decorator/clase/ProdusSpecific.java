package ro.acs.decorator.clase;

public abstract class ProdusSpecific implements IProdus{
    private IProdus produsDecorat;

    public ProdusSpecific(IProdus produsDecorat) {
        this.produsDecorat = produsDecorat;
    }

    @Override
    public String getNume() {
        return produsDecorat.getNume();
    }

    @Override
    public void getDescriereIngrediente() {
        System.out.println("Lista ingrediente pentru " + this.produsDecorat.getNume() + ":");
        produsDecorat.getDescriereIngrediente();
    }

    @Override
    public float getPret() {
        return produsDecorat.getPret();
    }


}
