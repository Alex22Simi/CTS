package ro.acs.clase;

public class SoftAdapter implements IOferta{
    private SoftInchiriareMasini softInchiriareMasini;

    public SoftAdapter(SoftInchiriareMasini softInchiriareMasini) {
        this.softInchiriareMasini = softInchiriareMasini;
    }

    @Override
    public void rezerva() {
        System.out.println("Afisare oferta din softul adaptat de la Soft cazare la Soft inchiriere masini.");
        softInchiriareMasini.inchiriaza();
    }


}
