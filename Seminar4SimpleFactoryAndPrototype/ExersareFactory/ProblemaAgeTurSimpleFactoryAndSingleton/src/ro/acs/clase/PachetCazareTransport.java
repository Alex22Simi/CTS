package ro.acs.clase;

public class PachetCazareTransport extends Pachet{
    private int discount;

     PachetCazareTransport(int pret, String webSiteCotact, boolean areCazare, boolean areTransport, int discount) {
        super(pret, webSiteCotact, areCazare, areTransport);
        this.discount = discount;
    }

    @Override
    public void descriere() {
        System.out.println("Pachetul de Cazare si Transport are pretul de " + super.getPret() + " si beneficiaza de un discount de " + this.discount + "%.");
    }

    @Override
    public float calculeazaPret() {
        return super.getPret() - super.getPret() * this.discount;
    }
}
