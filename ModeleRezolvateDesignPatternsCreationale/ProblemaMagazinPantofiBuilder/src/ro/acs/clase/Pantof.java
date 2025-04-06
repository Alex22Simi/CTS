package ro.acs.clase;

import java.util.ArrayList;

public class Pantof extends APantof{
    public Pantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) {
        super(tipPantof, nrPantof, dimensiuneToc, material);
        this.materialeSuplimentare = new ArrayList<>();
        this.listaMesajeText = new ArrayList<>();
    }

    @Override
    public float calculPret() {
        float pret = 50.0f;
        if(this.nrPantof > 42) {
            pret += 15;
        }
        if(this.material == ETipMaterial.Piele) {
            pret += 100;
        } else if(this.material == ETipMaterial.Textil) {
            pret += 25;
        } else {
            pret += 10;
        }

        if(this.dimensiuneToc > 5 && this.dimensiuneToc < 10) {
            pret += 25;
        } else if(this.dimensiuneToc >= 10) {
            pret += 50;
        }
        return pret;
    }

    @Override
    public void addMesaj(String mesaj) {
        int dimensiuneLista = 0;

        for(String mesaje : listaMesajeText) {
            dimensiuneLista += mesaje.length();
        }
        dimensiuneLista += mesaj.length();

        if(dimensiuneLista > this.nrPantof) {
            throw new ExceptieTextPantof("Textul trebuia sa fie mai mic decat nr de pantof!");
        }

        listaMesajeText.add(mesaj);
    }

    @Override
    public void addMaterial(ETipMaterial tipMaterial) {
        if(ETipPantof.Balerini == this.tipPantof && materialeSuplimentare.size() >= 1) {
            throw  new ExceptieMaterialPantof("La acest tip de pantof nu ai voie mai mult de un material suplimentar.");
        } else if(ETipPantof.Tenisi == this.tipPantof && materialeSuplimentare.size() >= 3) {
            throw  new ExceptieMaterialPantof("La acest tip de pantof nu ai voie mai mult de doua materiale suplimentare.");
        } else if(ETipPantof.Ghete == this.tipPantof && materialeSuplimentare.size() >= 5) {
            throw  new ExceptieMaterialPantof("La acest tip de pantof nu ai voie mai mult de cinci materiale suplimentare.");
        } else if(ETipPantof.Stiletto == this.tipPantof && materialeSuplimentare.size() >= 4) {
            throw  new ExceptieMaterialPantof("La acest tip de pantof nu ai voie mai mult de patru materiale suplimentare.");
        }
        materialeSuplimentare.add(tipMaterial);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pantof{");
        sb.append("tipPantof=").append(tipPantof);
        sb.append(", nrPantof=").append(nrPantof);
        sb.append(", dimensiuneToc=").append(dimensiuneToc);
        sb.append(", material=").append(material);
        sb.append(", materialeSuplimentare=").append(materialeSuplimentare);
        sb.append(", listaMesajeText=").append(listaMesajeText);
        sb.append('}');
        return sb.toString();
    }
}
