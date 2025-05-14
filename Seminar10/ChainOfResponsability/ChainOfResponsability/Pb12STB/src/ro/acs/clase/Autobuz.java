package ro.acs.clase;

public class Autobuz extends AbstractRecomandareTransport{
    @Override
    public void recomanda(float distanta) {
        if(distanta < 5) {
            System.out.println("Este recomandat sa iei autobuzul.");
        } else if(urmatorul != null) {
            urmatorul.recomanda(distanta);
        }
    }
}
