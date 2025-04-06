package ro.acs.clase;

public class EchipaNationalaFactory {
    public AbstractEchipaNationala getEchipa(TipEchipaNationala tip,String stilJoc, String continent, String numeEchipa) {
        switch (tip) {
            case Argentina -> {
                return new Argentina(stilJoc, continent, numeEchipa);
            }
            case Brazilia -> {
                return new Brazilia(stilJoc, continent, numeEchipa);
            }
            case Uruguay -> {
                return new Uruguay(stilJoc, continent, numeEchipa);
            }
            case Romania -> {
                return new Romania(stilJoc, continent, numeEchipa);
            }
            default -> {
                return null;
            }
        }
    }
}
