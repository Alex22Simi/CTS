package ro.acs.clase;

public class Masina implements  IMasina{
    private String modelMasina;
    private int anFabricatie;
    public String getCodUnic(){
        return this.modelMasina + "-" + this.anFabricatie;
    }

    public Masina(String modelMasina, int anFabricatie) {
        this.modelMasina = modelMasina;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModelMasina() {
        return this.modelMasina;
    }

    @Override
    public int getAnFabricatie() {
        return this.anFabricatie;
    }
}
