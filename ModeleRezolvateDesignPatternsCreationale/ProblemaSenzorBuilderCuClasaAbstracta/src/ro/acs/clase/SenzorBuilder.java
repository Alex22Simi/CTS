package ro.acs.clase;

public class SenzorBuilder implements IBuilder{
    protected boolean PM2_5;
    protected boolean PM2_10;
    protected boolean VOC;
    protected boolean CO2;
    protected boolean CO;

    public SenzorBuilder setPM2_5(boolean PM2_5) {
        this.PM2_5 = PM2_5;
        return this;
    }

    public SenzorBuilder setPM2_10(boolean PM2_10) {
        this.PM2_10 = PM2_10;
        return this;
    }

    public SenzorBuilder setVOC(boolean VOC) {
        this.VOC = VOC;
        return this;
    }

    public SenzorBuilder setCO2(boolean CO2) {
        this.CO2 = CO2;
        return this;
    }

    public SenzorBuilder setCO(boolean CO) {
        this.CO = CO;
        return this;
    }

    private void reset() {
        this.PM2_5 = false;
        this.PM2_10 = false;
        this.VOC = false;
        this.CO2 = false;
        this.CO = false;
    }

    @Override
    public Senzor build() {
        Senzor senzor = new Senzor(this.PM2_5, this.PM2_10, this.VOC, this.CO2, this.CO);
        reset();
        return senzor;
    }


}
