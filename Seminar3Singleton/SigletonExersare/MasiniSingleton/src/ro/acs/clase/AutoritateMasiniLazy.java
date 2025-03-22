package ro.acs.clase;

public class AutoritateMasiniLazy {
    private String nume;
    private String webSite;
    private int nrReglementari;
    private static AutoritateMasiniLazy instance = null;

    private AutoritateMasiniLazy(String nume, String webSite, int nrReglementari) {
        this.nume = nume;
        this.webSite = webSite;
        this.nrReglementari = nrReglementari;
    }

    public static AutoritateMasiniLazy getInstance(String nume, String webSite, int nrReglementari) {
        if(instance == null) {
            instance = new AutoritateMasiniLazy(nume, webSite, nrReglementari);
        }
        return instance;
    }
    public void reglementeazaModel(String model) {
        System.out.println("Modelul " + model + " a fost reglementat");
        nrReglementari++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateMasiniLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", webSite='").append(webSite).append('\'');
        sb.append(", nrReglementari=").append(nrReglementari);
        sb.append('}');
        return sb.toString();
    }
}
