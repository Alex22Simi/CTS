package ro.acs.clase;

public class AgeTur {
    private static  AgeTur instance = null;

    public static AgeTur getInstance() {
        if(instance == null) {
            instance = new AgeTur();
        }
        return instance;
    }

    public Pachet getPachet(TipPachet tipPachet) {
        switch (tipPachet) {
            case TipPachet.Cazare -> {
                return new PachetCazare();
            }
            case TipPachet.Transport -> {
                return new PachetTransport();
            }
            case TipPachet.CazareTransport -> {
                return new PachetCazareTransport();
            }
            default -> {
                return null;
            }
        }
    }
}
