package ro.acs.program;


import ro.acs.clase.ISpital;
import ro.acs.clase.ProxySpital;
import ro.acs.clase.Spital;
import ro.acs.clase.Vizitator;

public class Main {
    public static void main(String[] args) {
        Vizitator vizitator1 = new Vizitator("Marcel");
        Vizitator vizitator2 = new Vizitator("Ionel");
        Vizitator vizitator3 = new Vizitator("Popescu");
        Vizitator vizitator4 = new Vizitator("Marinescu");
        Vizitator vizitator5 = new Vizitator("Mircea");
        Vizitator vizitator6 = new Vizitator("Pavel");

        ISpital spital = new Spital("Spitalul Judetean Cluj");
        ProxySpital spitalCuViziteSarbatori = new ProxySpital(spital);

        spitalCuViziteSarbatori.primesteVizitator(vizitator1.getNume(), "Andrei");
        spitalCuViziteSarbatori.primesteVizitator(vizitator2.getNume(), "Andrei");
        spitalCuViziteSarbatori.reseteazaVizite();
        spitalCuViziteSarbatori.primesteVizitator(vizitator4.getNume(), "Andrei");
        spitalCuViziteSarbatori.primesteVizitator(vizitator5.getNume(), "Andrei");
        spital.primesteVizitator(vizitator3.getNume(), "Ion");
        spital.primesteVizitator(vizitator6.getNume(), "Ion");
    }
}