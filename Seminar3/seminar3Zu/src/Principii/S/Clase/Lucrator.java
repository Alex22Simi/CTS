package Principii.S.Clase;

public class Lucrator extends Angajat{
    private static ICalculator calculator;
    private int nrOre;
    static {
        calculator = new CalculatorLucrator();
    }

    public Lucrator(String nume, int nrOre) {
        super(nume);
        this.nrOre = nrOre;
    }

    public int getNrOre() {
        return nrOre;
    }
}
