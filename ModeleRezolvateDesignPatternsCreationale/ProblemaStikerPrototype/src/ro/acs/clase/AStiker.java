package ro.acs.clase;

public abstract class AStiker implements Cloneable{
    protected int dimensiune;
    protected String culoare;

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        AStiker clonaStiker = (AStiker) super.clone();
        clonaStiker.dimensiune = this.dimensiune;
        clonaStiker.culoare = this.culoare;
        return clonaStiker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AStiker{");
        sb.append("dimensiune=").append(dimensiune);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
