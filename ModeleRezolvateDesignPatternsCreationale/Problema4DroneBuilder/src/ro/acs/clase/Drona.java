package ro.acs.clase;

public class Drona extends  ADrona{

    public Drona(String model, String softwareVersion, float maxSpeed) {
        super(model, softwareVersion, maxSpeed);
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public void pretDronaDupaViteza() {
        float pretDrona = 1000;
        if(this.maxSpeed > 50 && this.maxSpeed < 100) {
            pretDrona += 1000;
        } else if(this.maxSpeed < 50) {
            pretDrona -= 500;
        } else if(this.maxSpeed >= 100) {
            pretDrona += 2000;
        }
        System.out.println("Drona are pretul de " + pretDrona + " EURO!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drona{");
        sb.append("model='").append(model).append('\'');
        sb.append(", softwareVersion='").append(softwareVersion).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append('}');
        return sb.toString();
    }
}
