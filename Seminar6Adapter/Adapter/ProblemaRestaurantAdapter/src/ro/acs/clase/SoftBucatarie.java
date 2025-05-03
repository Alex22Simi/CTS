package ro.acs.clase;

public class SoftBucatarie implements ISoft{
    private int nrFactura;
    private int vanzare;

    public SoftBucatarie(int nrFactura, int vanzare) {
        this.nrFactura = nrFactura;
        this.vanzare = vanzare;
    }


    public int getNrFactura() {
        return nrFactura;
    }

    public int getVanzare() {
        return vanzare;
    }
    @Override
    public void print() {
        if(verificaVanzare() == true) {
            System.out.println("S-a printat factura cu nr. " + this.nrFactura);
        } else {
            System.out.println("Factura nu trebuia sa fie inca printata!");
        }
    }
    public boolean verificaVanzare() {
        if(this.vanzare >= 3000) {
            System.out.println("Se cere printarea facturii.");
            return true;
        } else {
            return false;
        }
    }
}
