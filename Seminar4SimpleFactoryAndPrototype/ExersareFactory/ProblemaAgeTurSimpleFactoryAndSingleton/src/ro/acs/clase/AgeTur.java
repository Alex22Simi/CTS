package ro.acs.clase;

public class AgeTur {
    private int pret;
    private String webSiteContact;
    private static AgeTur instance = null;

    private AgeTur(int pret, String webSiteContact) {
        this.pret = pret;
        this.webSiteContact = webSiteContact;
    }

    public static AgeTur getInstance(int pret, String webSiteContact) {
        if(instance == null) {
            instance = new AgeTur(pret, webSiteContact);
        }
        return instance;
    }

    public Pachet getPachet(TipPachet tipPachet, boolean areCazare, boolean areTransport, int discount) {
        switch(tipPachet) {
            case TipPachet.Cazare -> {
                return new PachetCazare(this.pret, this.webSiteContact, areCazare, areTransport, discount);
            }
            case TipPachet.Transport -> {
                return new PachetTransport(this.pret, this.webSiteContact, areCazare, areTransport, discount);
            }
            case TipPachet.CazareTransport -> {
                return new PachetCazareTransport(this.pret, this.webSiteContact, areCazare, areTransport, discount);
            }
            default -> {
                return null;
            }
        }
    }

}
