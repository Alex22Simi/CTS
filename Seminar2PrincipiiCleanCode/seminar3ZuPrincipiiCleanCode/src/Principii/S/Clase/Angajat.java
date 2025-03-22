package Principii.S.Clase;

public class Angajat {
    private String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    public abstract  float getSalariu();
}
