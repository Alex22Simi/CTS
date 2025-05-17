package ro.acs.decorator.clase;

public class Magazin extends AbstractMagazin{
    private String nume;

    public Magazin(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public double calculeazaTotal(Client client, Comanda comanda) {
        double cost = comanda.getValoare();
        cost += comanda.getAdresa().toLowerCase().contains("bucuresti") ? 10 : 20;
        return cost;
    }
}
