package ro.acs.clase;

public class HandlerTramvai extends ARecomandaTransport{

    @Override
    public void recomanda(int distanta) {
        if(distanta <= 10) {
            System.out.println("Se recomanda sa iei Tramvaiul.");
        } else if (urmator != null) {
            urmator.recomanda(distanta);
        }
    }
}
