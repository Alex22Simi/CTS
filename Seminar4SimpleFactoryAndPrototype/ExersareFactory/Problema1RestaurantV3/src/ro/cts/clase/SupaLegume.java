package ro.cts.clase;

public class SupaLegume extends Supa{
    private int discount;

     SupaLegume(int cantitate, float pret, boolean areArdei, boolean areSmantana, int discount) {
        super(cantitate, pret, areArdei, areSmantana);
        this.discount = discount;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de legume de " + super.getCantitate() + " grame si are urmatorul discount de " + this.discount + "%.");
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret() - super.getPret() * this.discount;
    }
}
