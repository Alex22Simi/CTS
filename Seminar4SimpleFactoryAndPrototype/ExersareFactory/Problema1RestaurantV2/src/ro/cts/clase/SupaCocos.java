package ro.cts.clase;

public class SupaCocos extends Supa{
     SupaCocos(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
