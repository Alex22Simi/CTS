package ro.acs.flyweight.clase;

public class Reteta {
    private String numePacient;
    private String diagnostic;

    public Reteta(String numePacient, String diagnostic) {
        this.numePacient = numePacient;
        this.diagnostic = diagnostic;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public String getDiagnostic() {
        return diagnostic;
    }
}
