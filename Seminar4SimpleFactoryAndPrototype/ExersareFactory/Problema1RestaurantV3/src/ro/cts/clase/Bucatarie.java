package ro.cts.clase;

public class Bucatarie {
    private int cantitate;
    private float pret;

    public Bucatarie(int cantitate, float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }
    public Supa getSupa(TipSupe tip, boolean areArdei, boolean areSmantana, int discount) {
        switch(tip) {
            case TipSupe.Ciuperci -> {
                return new SupaCiuperci(this.cantitate, this.pret, areArdei, areSmantana, discount);
            }
            case TipSupe.Legume -> {
                return new SupaLegume(this.cantitate, this.pret, areArdei, areSmantana, discount);
            }
            case TipSupe.Vita -> {
                return new SupaVita(this.cantitate, this.pret, areArdei, areSmantana, discount);
            }
            default -> {
                return null;
            }
        }
    }
}
