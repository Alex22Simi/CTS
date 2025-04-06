package ro.acs.clase;

public abstract class AbstractEchipaNationala {
    protected String stilJoc;
    protected String continent;
    public abstract void getStilJoc();
    public abstract void getContinent();

    public AbstractEchipaNationala(String stilJoc, String continent) {
        this.stilJoc = stilJoc;
        this.continent = continent;
    }
}
