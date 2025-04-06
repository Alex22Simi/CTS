package ro.acs.clase;

public class RaportRiscSanatate implements  AbstractAirQualityReport{
    @Override
    public void genereazaRaport() {
        System.out.println("Acesta este un raport care indica riscul sanatatii.");
    }
}
