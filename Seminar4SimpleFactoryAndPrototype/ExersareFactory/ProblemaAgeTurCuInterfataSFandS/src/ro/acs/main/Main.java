package ro.acs.main;

import ro.acs.clase.AgeTur;
import ro.acs.clase.Pachet;
import ro.acs.clase.TipPachet;

public class Main {
    public static void main(String[] args) {
        AgeTur ageTur = AgeTur.getInstance();
        AgeTur ageTur1 = AgeTur.getInstance();
        Pachet pachetCazare = ageTur.getPachet(TipPachet.Cazare);
        Pachet pachetTransport = ageTur.getPachet(TipPachet.Transport);
        Pachet pachetCazareTransport = ageTur.getPachet(TipPachet.CazareTransport);
        pachetCazare.afiseazaDescrierePachet();
        pachetTransport.afiseazaDescrierePachet();
        pachetCazareTransport.afiseazaDescrierePachet();

        System.out.println(ageTur == ageTur1);
    }
}