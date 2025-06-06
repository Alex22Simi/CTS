package ro.acs.clase.Facade;

import ro.acs.clase.ChainOfResponsability.Candidat;
import ro.acs.clase.ChainOfResponsability.FiltruAbstract;
import ro.acs.clase.Strategy.IStrategy;
import ro.acs.clase.Strategy.TehnicaFiltrare;

import java.util.ArrayList;
import java.util.List;

public class Admitere {
    private FiltruAbstract filtru1;
    private FiltruAbstract filtru2;
    private FiltruAbstract filtru3;
    private List<Candidat> listaCandidati;
    private IStrategy strategieCurenta;

    public Admitere setStrategieCurenta(IStrategy strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
        return this;
    }


    public Admitere(FiltruAbstract filtru1, FiltruAbstract filtru2, FiltruAbstract filtru3) {
        this.filtru1 = filtru1;
        this.filtru2 = filtru2;
        this.filtru3 = filtru3;
        listaCandidati = new ArrayList<>();
        creareLant();
    }


    public void adaugaCandidat(Candidat candidat) {
        listaCandidati.add(candidat);
    }
    public void lansareProcesAdmitere() {
        System.out.println(this.filtru1.filtrare(listaCandidati));
    }

    private void creareLant() {

        //folosind strategia curenta setez filtrele
        TehnicaFiltrare tehnicaFiltrare = strategieCurenta.generareStrategie();
        filtru1 = tehnicaFiltrare.getFiltru1();
        filtru2 = tehnicaFiltrare.getFiltru2();
        filtru3 = tehnicaFiltrare.getFiltru3();

        filtru1.setNextHandler(filtru2);
        filtru2.setNextHandler(filtru3);

    }

}
