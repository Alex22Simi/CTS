package ro.acs.clase;

public class SoftBar {
    private int nrFactura;

    public SoftBar(int nrFactura) {
        this.nrFactura = nrFactura;
    }

    public int getNrFactura() {
        return nrFactura;
    }
    public void print() {
        System.out.println("S-a printat factura pentru vanzarea de la bar cu nr " + this.nrFactura);
    }
}
