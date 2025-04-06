package ro.acs.fabrici;

import ro.acs.clase.AbstractEchipaNationala;
import ro.acs.clase.EchipaItalia;
import ro.acs.clase.EchipaRomania;

public class CreatorEuropa extends AbstractEchipaCreator {
    private int idContinent;

    public CreatorEuropa(int idContinent) {
        this.idContinent = idContinent;
    }

    @Override
    public AbstractEchipaNationala creeazaEchipa(TipTara tip, String stilJoc, String continent) {
        switch(tip) {
            case TariEuropa.Italia -> {
                return new EchipaItalia(stilJoc, continent, this.idContinent);
            }
            case TariEuropa.Romania -> {
                return new EchipaRomania(stilJoc, continent, this.idContinent);
            }
            default -> {
                return null;
            }
        }
    }
}
