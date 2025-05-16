package ro.acs.clase;

public class HandlerTroleibuz extends ARecomandaTransport{
    @Override
    public void recomanda(int distanta) {
        if(distanta < 0) {
            System.out.println("Parametrul este incorect.");
        }
        if(distanta <= 3) {
            System.out.println("Se recomanda sa iei Troleibuzul.");
        } else if (urmator != null) {
            urmator.recomanda(distanta);
        }
    }
}
