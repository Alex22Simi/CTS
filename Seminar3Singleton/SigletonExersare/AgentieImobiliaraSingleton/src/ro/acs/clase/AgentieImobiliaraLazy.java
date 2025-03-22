package ro.acs.clase;

public class AgentieImobiliaraLazy {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraLazy instance = null;

    private AgentieImobiliaraLazy(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public static AgentieImobiliaraLazy getInstance(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        if (instance == null) {
            instance = new AgentieImobiliaraLazy(nume, nrAnunturi, site, cifraAfaceri);
        }
        return instance;
    }
    public void posteazaAnunt(String anunt) {
        System.out.println("Anuntul " + anunt + " a fost postat!");
        this.nrAnunturi++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieImobiliaraLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAnunturi=").append(nrAnunturi);
        sb.append(", site='").append(site).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }
}
