package ro.acs.clase;

public class RaportFactory {
    public static AbstractAirQualityReport getReport(int nrParticule) {
        if(nrParticule > 0 && nrParticule <= 30) {
            return new RaportAerCurat();
        } else if(nrParticule > 31 && nrParticule < 70) {
            return new RaportAvertizare();
        } else if(nrParticule > 71){
            return new RaportRiscSanatate();
        }
        return null;
    }
}
