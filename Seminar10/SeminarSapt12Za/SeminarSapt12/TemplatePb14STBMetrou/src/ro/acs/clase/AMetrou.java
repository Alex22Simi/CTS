package ro.acs.clase;

public abstract class AMetrou {
    protected abstract void opresteStatia1();
    protected abstract void opresteStatia2();
    protected abstract void opresteStatia3();
    protected abstract void opresteStatia4();
    protected abstract void opresteStatia5();


    //OBLIGATORIU LA TEMPLATE SA FIE FINAL
    public final void circulaTur() {
        opresteStatia1();
        opresteStatia2();
        opresteStatia3();
        opresteStatia4();
        opresteStatia5();
    }

    public final void circulaRetur() {
        opresteStatia5();
        opresteStatia4();
        opresteStatia3();
        opresteStatia2();
        opresteStatia1();
    }



}
