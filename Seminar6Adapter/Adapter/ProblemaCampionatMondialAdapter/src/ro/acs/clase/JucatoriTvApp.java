package ro.acs.clase;

public class JucatoriTvApp{
    private String echipa;
    private String pozitie;

    public JucatoriTvApp(String echipa, String pozitie) {
        this.echipa = echipa;
        this.pozitie = pozitie;
    }

    public void afiseazaInformatii() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JucatoriTvApp{");
        sb.append("echipa='").append(echipa).append('\'');
        sb.append(", pozitie='").append(pozitie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
