package ro.ase.clase;

public class AutoritatePescuitEager {
    private String denumire;
    private String webSite;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static AutoritatePescuitEager instance = new AutoritatePescuitEager("ANPA", "ANPA.ro", 10, 100); //Eager initialization

    private AutoritatePescuitEager(String denumire, String webSite, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.webSite = webSite;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static AutoritatePescuitEager getInstance() {
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

   public void angajeaza(int nrAngajati) {
        this.nrAngajati += nrAngajati;
    }

    public void concediaza(int nrAngajati) {
        this.nrAngajati -= nrAngajati;
    }

    public void emiteAutorizatie(String numePersoana) {
        System.out.println("A fost emisa autorizatie pentru " + numePersoana);
        this.nrAutorizatiiEmise++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritatePescuitEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", webSite='").append(webSite).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }
}
