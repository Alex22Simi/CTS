package ro.acs.clase;

public class Tramvai extends AbstractRecomandareTransport{
    @Override
    public void recomanda(float distanta) {
        if(distanta < 10) {
            System.out.println("Este recomandat sa iei tramvaiul.");
        } else if (urmatorul != null){
            urmatorul.recomanda(distanta);
        }
    }
}
