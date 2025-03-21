package Principii.S.Clase;

public class CalculatorLucrator implements ICalculator{
    @Override
    public float calculSalariu(Angajat angajat) {
        return 100 + ((Lucrator) angajat).getNume();
    }
}
