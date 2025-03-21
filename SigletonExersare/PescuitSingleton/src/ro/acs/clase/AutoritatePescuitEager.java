package ro.acs.clase;

public class AutoritatePescuitEager {
    private String denumire;
    private String webSite;
    private int nrAngajati;
    private int nrAutorizatiiEmise;
    private static AutoritatePescuitEager instance = new AutoritatePescuitEager("ANPA","ANPA.RO", 100, 700);//Eager initialization

    private AutoritatePescuitEager(String denumire, String webSite, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.webSite = webSite;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static AutoritatePescuitEager getInstance() {
        return instance;
    }

    public void angajeaza(int nrAngajatiNoi) {
        if(nrAngajatiNoi >= 1) {
            this.nrAngajati += nrAngajatiNoi;
        }
    }

    public void concediaza(int nrAngajatiConcediati) {
        if(nrAngajatiConcediati >= 1) {
            this.nrAngajati -= nrAngajatiConcediati;
        }
    }

    public void emiteAutoritate(String numePersoana) {
        System.out.println("A fost emisa autoritate pentru " + numePersoana);
        this.nrAutorizatiiEmise++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritatePescuitEager: ");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", webSite='").append(webSite).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        return sb.toString();
    }
}
