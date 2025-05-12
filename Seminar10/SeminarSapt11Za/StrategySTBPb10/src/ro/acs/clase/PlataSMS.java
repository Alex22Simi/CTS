package ro.acs.clase;

public class PlataSMS implements IMetodaPlata{

    @Override
    public void plataste(float pretBilet) {
        System.out.println("Ai platit prin SMS.");
    }
}
