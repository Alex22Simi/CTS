package ro.acs.clase;

public class EchipaBrazilia extends AbstractEchipaNationala{
    private int idContinent;

    public EchipaBrazilia(String stilJoc, String continent, int idContinent) {
        super(stilJoc, continent);
        this.idContinent = idContinent;
    }

    @Override
    public void getStilJoc() {
        System.out.println(this.stilJoc);
    }

    @Override
    public void getContinent() {
        System.out.println(this.continent);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EchipaBrazilia{");
        sb.append("idContinent=").append(idContinent);
        sb.append(", stilJoc='").append(stilJoc).append('\'');
        sb.append(", continent='").append(continent).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
