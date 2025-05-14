package ro.acs.program;


import ro.acs.clase.*;

public class Main {
    public static void main(String[] args) {
        AbstractRecomandareTransport troleibuz = new Troleibuz();
        AbstractRecomandareTransport tramvai = new Tramvai();
        AbstractRecomandareTransport autobuz = new Autobuz();
        AbstractRecomandareTransport metrou = new Metrou();

        troleibuz.setUrmatorul(autobuz);
        autobuz.setUrmatorul(tramvai);
        tramvai.setUrmatorul(metrou);

        troleibuz.recomanda(11);
        autobuz.recomanda(1);
    }
}