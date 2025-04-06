package ro.acs.clase;

public class RaportAerCurat implements AbstractAirQualityReport{
    @Override
    public void genereazaRaport() {
        System.out.println("Acesta este un raport de aer curat.");
    }
}
