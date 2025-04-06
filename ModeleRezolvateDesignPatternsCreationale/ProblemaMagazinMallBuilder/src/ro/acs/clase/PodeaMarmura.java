package ro.acs.clase;

public class PodeaMarmura implements IPodea{
    private float duritate = 9.0f;
    @Override
    public float getDuritate() {
        return this.duritate;
    }

    @Override
    public void curata() {
        System.out.println("Podeaua de marmura cu duritatea " + this.duritate + " a fost curatata.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PodeaMarmura{");
        sb.append("duritate=").append(duritate);
        sb.append('}');
        return sb.toString();
    }
}
