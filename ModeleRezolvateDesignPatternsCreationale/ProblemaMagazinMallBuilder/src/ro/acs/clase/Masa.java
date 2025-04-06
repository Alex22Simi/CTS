package ro.acs.clase;

public class Masa implements IDecoratiuni{
    private ETipMaterial tipMaterial = ETipMaterial.Lemn;
    @Override
    public void curata() {
        System.out.println("Masa cu material de tipul " + this.tipMaterial + " a fost curatata!");
    }

    @Override
    public ETipMaterial getMaterial() {
        return this.tipMaterial;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("tipMaterial=").append(tipMaterial);
        sb.append('}');
        return sb.toString();
    }
}
