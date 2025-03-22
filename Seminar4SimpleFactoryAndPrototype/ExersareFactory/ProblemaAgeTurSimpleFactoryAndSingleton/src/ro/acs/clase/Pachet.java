package ro.acs.clase;

public abstract class Pachet {
    private int pret;
    private String webSiteCotact;
    private boolean areCazare;
    private boolean areTransport;

     Pachet(int pret, String webSiteCotact, boolean areCazare, boolean areTransport) {
        this.pret = pret;
        this.webSiteCotact = webSiteCotact;
        this.areCazare = areCazare;
        this.areTransport = areTransport;
    }

    public int getPret() {
        return pret;
    }

    public String getWebSiteCotact() {
        return webSiteCotact;
    }

    public boolean isAreCazare() {
        return areCazare;
    }

    public boolean isAreTransport() {
        return areTransport;
    }
    public abstract void descriere();
    public abstract float calculeazaPret();

}
