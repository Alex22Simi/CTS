package ro.acs.clase;

public class AutoritateMasiniEager {
    private String nume;
    private String webSite;
    private int nrReglementari;
    private static AutoritateMasiniEager instance = new AutoritateMasiniEager("Rapid", "Rapid.ro", 100);

    private AutoritateMasiniEager(String nume, String webSite, int nrReglementari) {
        this.nume = nume;
        this.webSite = webSite;
        this.nrReglementari = nrReglementari;
    }

    public static AutoritateMasiniEager getInstance() {
        return instance;
    }
    public void reglementeazaModel(String model) {
        System.out.println("Modelul " + model + " a fost reglementat");
        nrReglementari++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateMasiniEager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", webSite='").append(webSite).append('\'');
        sb.append(", nrReglementari=").append(nrReglementari);
        sb.append('}');
        return sb.toString();
    }
}
