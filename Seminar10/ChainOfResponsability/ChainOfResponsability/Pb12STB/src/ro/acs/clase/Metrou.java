package ro.acs.clase;

public class Metrou extends AbstractRecomandareTransport{
    @Override
    public void recomanda(float distanta) {
        if(distanta > 10) {
            System.out.println("Este recomandat sa iei metroul.");
        }
    }
}
