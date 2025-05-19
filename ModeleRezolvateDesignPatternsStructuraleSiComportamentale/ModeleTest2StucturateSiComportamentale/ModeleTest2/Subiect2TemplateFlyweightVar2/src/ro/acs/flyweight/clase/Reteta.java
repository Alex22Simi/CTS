package ro.acs.flyweight.clase;

public class Reteta {
    private String numePacient;
    private String numeDiagnostic;

    public Reteta(String numePacient, String numeDiagnostic) {
        this.numePacient = numePacient;
        this.numeDiagnostic = numeDiagnostic;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public String getNumeDiagnostic() {
        return numeDiagnostic;
    }
}
