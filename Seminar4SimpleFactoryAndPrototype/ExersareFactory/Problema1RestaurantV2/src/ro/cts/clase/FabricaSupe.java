package ro.cts.clase;

public class FabricaSupe {
    private float pret;
    private float calorii;

    public FabricaSupe(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }
    public Supa getSupe(TipSupa tipSupa, float cantitate) {
        switch(tipSupa) {
            case TipSupa.Legume -> {
                return new SupaLegume(this.pret, cantitate, this.calorii);
            }
            case TipSupa.Vita -> {
                return new SupaVita(this.pret, cantitate, this.calorii);
            }
            case TipSupa.Cocos -> {
                return new SupaCocos(this.pret, cantitate,this.calorii);
            }
            default -> {
                return null;
            }
        }
    }
}
