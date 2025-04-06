package ro.acs.clase;

public class PodeaLemnLucios implements IPodea{
    private float duritate = 6.0f;
    @Override
    public float getDuritate() {
        return this.duritate;
    }

    @Override
    public void curata() {
        System.out.println("Podeaua  lemn lucios cu duritatea " + this.duritate + " a fost curatata.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PodeaLemnLucios{");
        sb.append("duritate=").append(duritate);
        sb.append('}');
        return sb.toString();
    }
}
