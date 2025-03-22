package ro.cts.clase;

public class FabricaSupe {
    private int gramaj;
    private double pretPerSutaDeGrame;

    public FabricaSupe(int gramaj, double pretPerSutaDeGrame) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
    }
    public Supa getSupa(TipSupa tipSupa, String ingrediente, double value) {
        switch (tipSupa) {
            case TipSupa.Legume -> {
                return new SupaLegume(this.gramaj, this.pretPerSutaDeGrame, ingrediente, value);
            }
            case TipSupa.Ciuperci -> {
               return  new SupaCiuperci(this.gramaj, this.pretPerSutaDeGrame, ingrediente, value);
            }
            case TipSupa.Vita -> {
                return new SupaVita(this.gramaj, this.pretPerSutaDeGrame, ingrediente, value);
            }
            default -> {
                return null;
            }
        }
    }
}
