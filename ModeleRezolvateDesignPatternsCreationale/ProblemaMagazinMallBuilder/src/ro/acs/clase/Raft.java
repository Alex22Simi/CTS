package ro.acs.clase;

public class Raft implements IDecoratiuni{
    private ETipMaterial tipMaterial = ETipMaterial.Plastic;
    @Override
    public void curata() {
        System.out.println("Raftul cu material de tipul " + this.tipMaterial + " a fost curatat!");
    }

    @Override
    public ETipMaterial getMaterial() {
        return this.tipMaterial;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raft{");
        sb.append("tipMaterial=").append(tipMaterial);
        sb.append('}');
        return sb.toString();
    }
}
