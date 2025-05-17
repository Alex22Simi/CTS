package ro.acs.decorator.clase;

import java.util.zip.Deflater;

public class ProdusSpecificItalienesc extends DecoratorProdus {
    private String toping;


    public ProdusSpecificItalienesc(IProdus produsDecorat, String toping) {
        super(produsDecorat);
        this.toping = toping;
    }

    @Override
    public void getDescriereIngrediente() {
        super.getDescriereIngrediente();
        System.out.println("Pe produsul comandat s-a adaugat topingul " + this.toping + " care este specific italienesc.");
    }
}
