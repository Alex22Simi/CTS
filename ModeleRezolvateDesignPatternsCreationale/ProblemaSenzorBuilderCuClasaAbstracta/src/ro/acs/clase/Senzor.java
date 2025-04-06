package ro.acs.clase;

public class Senzor extends AbstractAirQualitySensor{
     Senzor(boolean PM2_5, boolean PM2_10, boolean VOC, boolean CO2, boolean CO) {
        super(PM2_5, PM2_10, VOC, CO2, CO);
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    public void nrAbilitatiSenzor() {
        int count = 0;
        if (PM2_5) {
            count++;
        }
        if(PM2_10) {
            count++;
        }
        if(VOC) {
             count++;
        }
        if(CO2) {
            count++;
        }
        if(CO) {
            count++;
        }
        System.out.println("Senzorul are " + count + " abilitati.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Senzor{");
        sb.append("PM2_5=").append(PM2_5);
        sb.append(", PM2_10=").append(PM2_10);
        sb.append(", VOC=").append(VOC);
        sb.append(", CO2=").append(CO2);
        sb.append(", CO=").append(CO);
        sb.append('}');
        return sb.toString();
    }
}
