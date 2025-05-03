package ro.acs.program;

import ro.acs.clase.AdapterApp;
import ro.acs.clase.IDate;
import ro.acs.clase.JucatoriFifaApp;
import ro.acs.clase.JucatoriTvApp;

public class Main {
    public static void main(String[] args) {
        IDate jucatorFifa = new JucatoriFifaApp("Messi", "Argentina", "Atacant");
        IDate jucatorTV = new AdapterApp(new JucatoriTvApp("Argentina", "Atacant"));

        jucatorFifa.transmiteDate();
        System.out.println();

        jucatorTV.transmiteDate();
        System.out.println();

    }
}