package ro.acs.clase;

public abstract class OcupareMasaTemplate {
    abstract boolean cerereOcupareMasa();
    abstract void curataMasa();
    abstract void aseazaServetele();
    abstract void aseazaTacamuri();
    abstract void ocupaMasa();

    public final void pregatireMasa() {
        if(!cerereOcupareMasa()) {
            System.out.println("Nu este nevoie de ocupare a mesei.");
        } else {
            curataMasa();
            aseazaServetele();
            aseazaTacamuri();
            ocupaMasa();
        }
    }
}

