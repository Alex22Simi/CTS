package ro.acs.clase;

public class Client {
    private String nume;
    private boolean areNrTelefonSalvat;
    private boolean areAdresaEmailSalvata;

    public Client(String nume, boolean areNrTelefonSalvat, boolean areAdresaEmailSalvata) {
        this.nume = nume;
        this.areNrTelefonSalvat = areNrTelefonSalvat;
        this.areAdresaEmailSalvata = areAdresaEmailSalvata;
    }

    public boolean isAreNrTelefonSalvat() {
        return areNrTelefonSalvat;
    }

    public boolean isAreAdresaEmailSalvata() {
        return areAdresaEmailSalvata;
    }

    public String getNume() {
        return nume;
    }
}
