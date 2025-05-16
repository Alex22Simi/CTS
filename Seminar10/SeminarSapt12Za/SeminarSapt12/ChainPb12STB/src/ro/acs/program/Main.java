package ro.acs.program;


import ro.acs.clase.*;

public class Main {
    public static void main(String[] args) {
        ARecomandaTransport troleibuz = new HandlerTroleibuz();
        ARecomandaTransport autobuz = new HandlerAutobuz();
        ARecomandaTransport tramvai = new HandlerTramvai();
        ARecomandaTransport metrou = new HandlerMetrou();

        troleibuz.setUrmator(autobuz);
        autobuz.setUrmator(tramvai);
        tramvai.setUrmator(metrou);

        tramvai.recomanda(2);
        troleibuz.recomanda(2);

    }
}