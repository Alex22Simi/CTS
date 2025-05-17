package ro.acs.decorator.clase;

public class ProdusSpecificSpaniol extends DecoratorProdus{

    private String toping;

    public ProdusSpecificSpaniol(IProdus produsDecorat, String toping) {
        super(produsDecorat);
        this.toping = toping;
    }

    @Override
    public void getDescriereIngrediente() {
        super.getDescriereIngrediente();
        System.out.println("Pe produsul comandat s-a adaugat topingul " + this.toping + " care este specific spaniol.");
    }
}
