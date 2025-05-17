package ro.acs.decorator.clase;

public  class Comanda {
    private double valoare;
    private String adresa;

    public Comanda(double valoare, String adresa) {
        this.valoare = valoare;
        this.adresa = adresa;
    }

    public double getValoare() {
        return valoare;
    }

    public String getAdresa() {
        return adresa;
    }
}
