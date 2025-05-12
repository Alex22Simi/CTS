package ro.acs.clase;

public class CardBancar implements IMetodaPlata{
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plataste(float pretBilet) {
        if(this.sold > pretBilet) {
            System.out.println("Ai platit cu cardul bancar.");
            this.sold -= pretBilet;
        } else {
            System.out.println("Nu sunt suficienti bani.");
        }
    }
}
