package ro.acs.clase;

public class Pacient implements PacientAbstract{
    private String numePacient;
    private String numarTelefon;
    private String adresaEmail;

    public Pacient(String numePacient, String numarTelefon, String adresaEmail) {
        this.numePacient = numePacient;
        this.numarTelefon = numarTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {
        System.out.println(this.toString());
        System.out.println(spitalizare);
    }
}
