package ro.acs.clase;

public abstract class AbstractAirQualitySensor {
    protected boolean PM2_5;
    protected boolean PM2_10;
    protected boolean VOC;
    protected boolean CO2;
    protected boolean CO;

    public AbstractAirQualitySensor(boolean PM2_5, boolean PM2_10, boolean VOC, boolean CO2, boolean CO) {
        this.PM2_5 = PM2_5;
        this.PM2_10 = PM2_10;
        this.VOC = VOC;
        this.CO2 = CO2;
        this.CO = CO;
    }


    public abstract void displayInfo();
    public abstract void nrAbilitatiSenzor();

}
