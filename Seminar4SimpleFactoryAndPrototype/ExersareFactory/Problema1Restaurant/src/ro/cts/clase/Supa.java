package ro.cts.clase;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaDeGrame;
    private String ingrediente;
    public int getGramaj() {
        return gramaj;
    }

    public double getPretPerSutaDeGrame() {
        return pretPerSutaDeGrame;
    }

    public String getIngrediente() {
        return ingrediente;
    }

     Supa(int gramaj, double pretPerSutaDeGrame, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
        this.ingrediente = ingrediente;
    }
    public abstract void preparaSupa();
    public double calculeazaPret() {
        return (pretPerSutaDeGrame/100) * gramaj;
    }


}
