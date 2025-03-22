package ro.cts.clase;

public class SupaCiuperci extends Supa{
    private double cantitateCiuperci;

     SupaCiuperci(int gramaj, double pretPerSutaDeGrame, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Supa de ciuperci cu " + cantitateCiuperci + " grame este gata.");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + this.cantitateCiuperci/100 * getPretPerSutaDeGrame();
    }
}
