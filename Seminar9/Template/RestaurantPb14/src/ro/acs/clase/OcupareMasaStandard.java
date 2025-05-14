package ro.acs.clase;

public class OcupareMasaStandard extends OcupareMasaTemplate{
    private boolean ocupaMasa;


    public OcupareMasaStandard(boolean ocupaMasa) {
        this.ocupaMasa = ocupaMasa;
    }

    @Override
    boolean cerereOcupareMasa() {
        if(ocupaMasa) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    void curataMasa() {
        System.out.println("Se curata masa.");
    }

    @Override
    void aseazaServetele() {
        System.out.println("Se aseaza servetelele.");
    }

    @Override
    void aseazaTacamuri() {
        System.out.println("Se aseaza tacamurile.");
    }

    @Override
    void ocupaMasa() {
        System.out.println("Persoanele sunt invitate sa se aseze la masa.");
    }


}
