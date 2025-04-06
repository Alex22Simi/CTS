package ro.acs.clase;

public class PodeaStandard implements IPodea{
    private float duritate = 5.0f;
    @Override
    public float getDuritate() {
        return this.duritate;
    }

    @Override
    public void curata() {
        System.out.println("Podeaua standard cu duritatea " + this.duritate + " a fost curatata.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PodeaStandard{");
        sb.append("duritate=").append(duritate);
        sb.append('}');
        return sb.toString();
    }
}
