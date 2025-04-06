package ro.acs.program;


import ro.acs.clase.ETipMaterial;
import ro.acs.clase.ETipPantof;
import ro.acs.clase.Pantof;
import ro.acs.clase.PantofBuilder;

public class Main {
    public static void main(String[] args) {
        PantofBuilder builder = new PantofBuilder();
        Pantof pantofStiletto = builder.setMaterialeSuplimentare(ETipMaterial.Piele).setListaMesajeText("Acum este mai mic?").build(ETipPantof.Stiletto, 36, 0.8f, ETipMaterial.Textil);
        System.out.println(pantofStiletto.toString());

        Pantof pantofBalerini = builder.setMaterialeSuplimentare(ETipMaterial.Piele).build(ETipPantof.Balerini, 36, 0.8f, ETipMaterial.Textil);
        System.out.println(pantofBalerini.toString());

    }
}