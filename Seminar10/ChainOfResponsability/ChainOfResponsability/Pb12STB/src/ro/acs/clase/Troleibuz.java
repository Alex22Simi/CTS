package ro.acs.clase;

public class Troleibuz extends AbstractRecomandareTransport{
    @Override
    public void recomanda(float distanta) {
        if (distanta < 0) {
            return;
        }
        if(distanta < 3) {
            System.out.println("Este recomandat sa iei troleibuzul.");
        } else if(urmatorul != null) {
            urmatorul.recomanda(distanta);
        }
    }
}
