package ro.acs.clase;

public class Sectie implements IStructura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public Sectie setNume(String nume) {
        this.nume = nume;
        return this;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectie " + this.nume);
    }

    @Override
    public void adaugaNod(IStructura structura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(IStructura structura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IStructura getCopilNod(int index) {
        throw new UnsupportedOperationException();
    }
}
