package Principii.S.Clase;

public class CalculatorManager implements ICalculator{
    @Override
    public float calculSalariu(Angajat angajat) {
        return 100 + (((Manager)angajat).isAreMBA();
    }
}
