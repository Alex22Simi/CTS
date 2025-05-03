package ro.acs.clase;

public class SoftInchiriareMasini{

    private String marca;
    private int durata;

    public SoftInchiriareMasini(String marca, int durata) {
        this.marca = marca;
        this.durata = durata;
    }

    public String getMarca() {
        return marca;
    }

    public int getDurata() {
        return durata;
    }

    public void inchiriaza() {
        System.out.println("S-a închiriat mașina " + marca + " pentru " + durata + " zile.");
    }
}
