package ro.acs.clase;

public class AdapterPrinter implements NewToner{
    private TonerOld tonerOld;

    public AdapterPrinter(TonerOld tonerOld) {
        this.tonerOld = tonerOld;
    }

    @Override
    public void print() {
        this.tonerOld.print();
    }
}
