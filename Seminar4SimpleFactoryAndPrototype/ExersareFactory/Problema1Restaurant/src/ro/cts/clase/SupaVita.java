package ro.cts.clase;

public class SupaVita extends Supa{
    private double pretExtra;

     SupaVita(int gramaj, double pretPerSutaDeGrame, String ingrediente, double pretExtra) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.pretExtra = pretExtra;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Supa de vita comandata cu smantana costa cu " + this.pretExtra + " lei extra si este gata.");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + this.pretExtra;
    }
}
