package ro.acs.clase;

public abstract class ADrona {
    protected String model;
    protected String softwareVersion;
    protected float maxSpeed;

    public ADrona(String model, String softwareVersion, float maxSpeed) {
        this.model = model;
        this.softwareVersion = softwareVersion;
        this.maxSpeed = maxSpeed;
    }


    public abstract void display();
    public abstract void pretDronaDupaViteza();

}
