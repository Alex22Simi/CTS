package ro.cts.clase;

public class SupaLegume extends Supa{
    private double gramajCrutoane;

     SupaLegume(int gramaj, double pretPerSutaDeGrame, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Supa de legume cu " + gramajCrutoane + " de crutoane este gata.");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + this.gramajCrutoane/100 * getPretPerSutaDeGrame();
    }

}
