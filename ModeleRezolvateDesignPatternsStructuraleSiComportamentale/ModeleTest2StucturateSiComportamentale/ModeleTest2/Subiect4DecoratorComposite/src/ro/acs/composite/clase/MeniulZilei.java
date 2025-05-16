package ro.acs.composite.clase;

public class MeniulZilei extends Composite{


    public MeniulZilei(String nume) {
        super(nume);
    }

    @Override
    public int getPret() {
        return (int) (0.9 * super.getPret());
    }

}
