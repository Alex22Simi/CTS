package ro.acs.fabrici;

import ro.acs.clase.AbstractEchipaNationala;
import ro.acs.clase.EchipaArgentina;
import ro.acs.clase.EchipaBrazilia;

public class CreatorAmericaDeSud extends AbstractEchipaCreator {
    private int idContinent;

    public CreatorAmericaDeSud(int idContinent) {
        this.idContinent = idContinent;
    }

    @Override
    public AbstractEchipaNationala creeazaEchipa(TipTara tip, String stilJoc, String continent) {
        switch (tip) {
            case TariAmericaDeSud.Argentina -> {
                return new EchipaArgentina(stilJoc, continent, this.idContinent);
            }
            case TariAmericaDeSud.Brazilia -> {
                return new EchipaBrazilia(stilJoc, continent, this.idContinent);
            }
            default -> {
                return  null;
            }
        }
    }
}
