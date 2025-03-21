package Principii.S.Clase;

public class Manager extends Angajat{
    private boolean areMBA;

    public Manager(String nume, boolean areMBA) {
        super(nume);
        this.areMBA = areMBA;
    }

    public boolean isAreMBA() {
        return areMBA;
    }
}
