package ro.acs.clase;

public class DronaBuilder implements IBuilder{
    protected String model = "DronaAnonima";
    protected String softwareVersion  = "A000";
    protected float maxSpeed = 0.0f;

    public DronaBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public DronaBuilder setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    public DronaBuilder setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
    private void reset() {
        this.model = "DronaAnonima";
        this.softwareVersion = "A000";
        this.maxSpeed = 0.0f;
    }

    @Override
    public Drona build() {

        Drona drona = new Drona(this.model, this.softwareVersion, this.maxSpeed);
        reset();
        return drona;
    }
}
