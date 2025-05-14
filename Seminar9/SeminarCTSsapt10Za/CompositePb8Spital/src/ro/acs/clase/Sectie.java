package ro.acs.clase;

public class Sectie implements Structura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        throw new Exception("Nu a fost implementata.");
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        throw new Exception("Nu a fost implementata");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectia " + this.nume);
    }

    @Override
    public Structura getStructura(int index) throws Exception {
        throw new Exception("Nu a fost implementata.");
    }
}
