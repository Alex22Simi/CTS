package ro.acs.decorator.clase;

public class ProdusSpecificItalienesc extends ProdusSpecific{
    private String toping;

    public ProdusSpecificItalienesc(IProdus produsDecorat, String toping) {
        super(produsDecorat);
        this.toping = toping;
    }

    @Override
    public void getDescriereIngrediente() {
        super.getDescriereIngrediente();
        System.out.println("Produsului ii s-a adaugat toping italienesc " + this.toping);
    }


}
