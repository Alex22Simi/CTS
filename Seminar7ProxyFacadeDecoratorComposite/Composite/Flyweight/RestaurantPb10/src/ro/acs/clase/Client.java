package ro.acs.clase;

public class Client implements IClient{
    private String nume;
    private String nrTelefon;
    private String adresaMail;

    public Client(String nume, String nrTelefon, String adresaMail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    public String getNume() {
        return nume;
    }

    public Client setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public Client setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
        return this;
    }

    public String getAdresaMail() {
        return adresaMail;
    }

    public Client setAdresaMail(String adresaMail) {
        this.adresaMail = adresaMail;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresaMail='").append(adresaMail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaInformatii(Rezervare rezervare) {
        System.out.println(this.toString());
        System.out.println(rezervare.toString());
    }
}
