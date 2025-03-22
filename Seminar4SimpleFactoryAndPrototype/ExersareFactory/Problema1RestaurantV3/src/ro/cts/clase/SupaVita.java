package ro.cts.clase;

public class SupaVita extends Supa{
    private int discount;

     SupaVita(int cantitate, float pret, boolean areArdei, boolean areSmantana, int discount) {
        super(cantitate, pret, areArdei, areSmantana);
        this.discount = discount;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de vita de " + super.getCantitate() + " grame si are urmatorul discount de " + this.discount + "%.");
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret() - super.getPret() * this.discount;
    }
}
