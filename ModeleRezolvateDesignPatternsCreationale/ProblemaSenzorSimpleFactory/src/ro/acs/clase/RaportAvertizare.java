package ro.acs.clase;

public class RaportAvertizare implements AbstractAirQualityReport{
    @Override
    public void genereazaRaport() {
        System.out.println("Acesta este un raport de avertizare.");
    }
}
