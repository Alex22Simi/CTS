package ro.acs.clase;

public class Brazilia extends AbstractEchipaNationala{
    private String numeEchipa;

    public Brazilia(String stilJoc, String continent, String numeEchipa) {
        super(stilJoc, continent);
        this.numeEchipa = numeEchipa;
    }

    @Override
    public void afiseazaStilJoc() {
        System.out.println("Stilul de joc al echipei " + this.numeEchipa + " este " + super.stilJoc);
    }

    @Override
    public void getContinent() {
        System.out.println("Continentul in care se afla echipa " + this.numeEchipa + " se numeste " + super.continent);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brazilia{");
        sb.append("numeEchipa='").append(numeEchipa).append('\'');
        sb.append(", stilJoc='").append(stilJoc).append('\'');
        sb.append(", continent='").append(continent).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
