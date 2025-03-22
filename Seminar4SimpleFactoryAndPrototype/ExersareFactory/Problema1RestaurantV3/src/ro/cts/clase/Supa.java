package ro.cts.clase;

public abstract class Supa {
    private int cantitate;
    private float pret;
    private boolean areArdei;
    private boolean areSmantana;

     Supa(int cantitate, float pret, boolean areArdei, boolean areSmantana) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.areArdei = areArdei;
        this.areSmantana = areSmantana;
    }

    public int getCantitate() {
        return cantitate;
    }

    public float getPret() {
        return pret;
    }

    public boolean isAreArdei() {
        return areArdei;
    }

    public boolean isAreSmantana() {
        return areSmantana;
    }

   public abstract void afiseazaDescriere();
    public abstract float calculeazaPretFinal();
}
