package ro.acs.template.clase;

public class Pacient {
    private String nume;
    private boolean esteInStareGrava;

    public Pacient(String nume, boolean esteInStareGrava) {
        this.nume = nume;
        this.esteInStareGrava = esteInStareGrava;
    }

    public String getNume() {
        return nume;
    }

    public boolean isEsteInStareGrava() {
        return esteInStareGrava;
    }
}
