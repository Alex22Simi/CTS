package ro.acs.clase;

public abstract class AbstractEchipaNationala implements IEchipaNationala{
    protected String stilJoc;
    protected String continent;

    public AbstractEchipaNationala(String stilJoc, String continent) {
        this.stilJoc = stilJoc;
        this.continent = continent;
    }


}
