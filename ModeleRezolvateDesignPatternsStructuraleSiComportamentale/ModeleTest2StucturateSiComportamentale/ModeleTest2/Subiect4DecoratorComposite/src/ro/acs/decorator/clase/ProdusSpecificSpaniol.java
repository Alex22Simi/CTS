package ro.acs.decorator.clase;

public class ProdusSpecificSpaniol extends ProdusSpecific{
    private String toping;

    public ProdusSpecificSpaniol(IProdus produsDecorat, String toping) {
        super(produsDecorat);
        this.toping = toping;
    }

    @Override
    public void getDescriereIngrediente() {
        super.getDescriereIngrediente();
        System.out.println("Produsului ii s-a adaugat toping spaniol " + this.toping);
    }


}
