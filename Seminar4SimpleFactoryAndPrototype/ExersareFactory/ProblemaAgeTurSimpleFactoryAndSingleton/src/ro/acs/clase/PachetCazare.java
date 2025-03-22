package ro.acs.clase;

public class PachetCazare extends Pachet{
    private int discount;

     PachetCazare(int pret, String webSiteCotact, boolean areCazare, boolean areTransport, int discount) {
        super(pret, webSiteCotact, areCazare, areTransport);
        this.discount = discount;
    }

    @Override
    public void descriere() {
        System.out.println("Pachetul de cazare are pretul de " + super.getPret() + " si beneficiaza de un discount de " + this.discount + "%.");
    }

    @Override
    public float calculeazaPret() {
       return super.getPret() - super.getPret() * this.discount;
    }
}
