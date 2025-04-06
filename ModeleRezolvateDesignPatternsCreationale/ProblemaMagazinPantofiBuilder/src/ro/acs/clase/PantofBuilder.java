package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class PantofBuilder implements IBuilder{
    protected ETipPantof tipPantof;
    protected int nrPantof;
    protected float dimensiuneToc;
    protected ETipMaterial material;
    protected List<ETipMaterial> materialeSuplimentare = new ArrayList<>();
    protected List<String> listaMesajeText = new ArrayList<>();

    public PantofBuilder() {

    }

    public PantofBuilder setMaterialeSuplimentare(ETipMaterial tipMaterial) {
        materialeSuplimentare.add(tipMaterial);
        return this;
    }

    public PantofBuilder setListaMesajeText(String mesaj) {
       listaMesajeText.add(mesaj);
        return this;
    }

    public void reset() {
        this.tipPantof = ETipPantof.Stiletto;
        this.nrPantof = 35;
        this.dimensiuneToc = 0.5f;
        this.material = ETipMaterial.Textil;
        this.materialeSuplimentare = new ArrayList<>();
        this.listaMesajeText = new ArrayList<>();
    }
    @Override
    public Pantof build(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) {
        if(nrPantof < 35 && nrPantof > 45) {
            throw new ExceptieNrPantof("Numarul pantofului nu exista");
        }
        if(dimensiuneToc < 0.5 && dimensiuneToc > 12.5) {
            throw new ExceptieDimensiuneToc("Aceasta dimensiune de toc nu exista!");
        }
        Pantof pantof = new Pantof(tipPantof, nrPantof, dimensiuneToc, material);

        for(ETipMaterial materialAdaugat : materialeSuplimentare) {
            pantof.addMaterial(materialAdaugat);
        }
        for(String mesajAdaugat : listaMesajeText) {
            pantof.addMesaj(mesajAdaugat);
        }

        reset();
        return pantof;
    }


}
