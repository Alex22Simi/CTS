package ro.acs.main;

import ro.acs.clase.AgeTur;
import ro.acs.clase.Pachet;
import ro.acs.clase.PachetCazare;
import ro.acs.clase.TipPachet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgeTur ageTur = AgeTur.getInstance(5000, "AgeTur.ro");
        Pachet pachetCazare = ageTur.getPachet(TipPachet.Cazare, true, false, 10);
        Pachet pachetTransport = ageTur.getPachet(TipPachet.Transport, false, true, 15);
        Pachet pachetCazareTransport = ageTur.getPachet(TipPachet.CazareTransport, true, true, 20);

        pachetCazare.descriere();
        pachetTransport.descriere();
        pachetCazareTransport.descriere();

        System.out.println();

        AgeTur altaFirma = AgeTur.getInstance(5127162, "AltaFirma.ro");
        Pachet pachetCazareAltaFirma = altaFirma.getPachet(TipPachet.Cazare, true, false, 10);
        Pachet pachetTransportAltaFirma = altaFirma.getPachet(TipPachet.Transport, false, true, 15);
        Pachet pachetCazareTransportAltaFirma = altaFirma.getPachet(TipPachet.CazareTransport, true, true, 20);

        pachetCazareAltaFirma.descriere();
        pachetTransportAltaFirma.descriere();
        pachetCazareTransportAltaFirma.descriere();
    }
}