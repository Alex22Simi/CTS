package ro.acs.clase;

public class AgentieImobiliaraEager {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraEager instance = new AgentieImobiliaraEager("Agentie",10, "Agentie.ro", 1000);

    private AgentieImobiliaraEager(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public static AgentieImobiliaraEager getInstance() {
        return instance;
    }
    public void posteazaAnunt(String anunt) {
        System.out.println("Anuntul " + anunt + " a fost postat!");
        this.nrAnunturi++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieImobiliaraEager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAnunturi=").append(nrAnunturi);
        sb.append(", site='").append(site).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }
}
