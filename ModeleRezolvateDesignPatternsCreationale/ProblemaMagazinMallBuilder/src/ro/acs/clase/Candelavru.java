package ro.acs.clase;

public class Candelavru implements IDecoratiuni{
    private ETipMaterial tipMaterial = ETipMaterial.Sticla;
    @Override
    public void curata() {
        System.out.println("Candelavrul cu material de tipul " + this.tipMaterial + " a fost curatat!");
    }

    @Override
    public ETipMaterial getMaterial() {
        return this.tipMaterial;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Candelavru{");
        sb.append("tipMaterial=").append(tipMaterial);
        sb.append('}');
        return sb.toString();
    }
}
