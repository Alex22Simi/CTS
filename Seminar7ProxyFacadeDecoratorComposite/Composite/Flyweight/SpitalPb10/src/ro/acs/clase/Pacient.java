package ro.acs.clase;

public class Pacient implements IPacient{
    //punem atributele comune sau neschimbate
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Pacient(String nume, String numarTelefon, String adresa) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public Pacient setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public Pacient setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
        return this;
    }

    public String getAdresa() {
        return adresa;
    }

    public Pacient setAdresa(String adresa) {
        this.adresa = adresa;
        return this;
    }

    @Override
    public void afiseazaInformatii(Spitalizare s) {
        System.out.println(this.toString());
        System.out.println(s.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
