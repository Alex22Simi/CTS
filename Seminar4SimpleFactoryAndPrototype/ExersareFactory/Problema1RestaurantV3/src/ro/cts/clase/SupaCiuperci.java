package ro.cts.clase;

public class SupaCiuperci extends Supa{
    private int discount;

     SupaCiuperci(int cantitate, float pret, boolean areArdei, boolean areSmantana, int discount) {
        super(cantitate, pret, areArdei, areSmantana);
        this.discount = discount;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de ciuperci de " + super.getCantitate() + " grame si are urmatorul discount de " + this.discount + "%.");
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret() - super.getPret() * this.discount;
    }
}
