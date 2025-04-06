package ro.acs.clase;

public class Imprimanta extends AImprimanta{
    private int nivelToner;
    private boolean isColor;
    private int ip;
    private TipPrintare tipCuloare;
    private static final Imprimanta instance = new Imprimanta();
    private Imprimanta() {
        this.nivelToner = 250;
        this.isColor = true;
        this.ip = 1;
        this.tipCuloare = TipPrintare.COLOR;
    }
    @Override
    public int getNivelToner() {
        return this.nivelToner;
    }

    @Override
    public boolean isColor() {
        if (this.tipCuloare == TipPrintare.COLOR) {
            return true;
        }
        return false;
    }

    @Override
    public int getIP() {
        return this.ip;
    }
    public static Imprimanta getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imprimanta{");
        sb.append("nivelToner=").append(nivelToner);
        sb.append(", isColor=").append(isColor);
        sb.append(", ip=").append(ip);
        sb.append(", tipCuloare=").append(tipCuloare);
        sb.append('}');
        return sb.toString();
    }

    public  void printeaza(Document document, int paginaDeStart, int paginaStop, TipPrintare tip) {
        int nrPaginiPrintate = paginaStop - paginaDeStart;
        int nrToner = nrPaginiPrintate / 10 * 5;
        boolean isPrintat = false;
        if(TipPrintare.COLOR == tip && this.isColor == true) {
            if(2 * nrToner < this.nivelToner) {
                this.nivelToner -= 2 * nrToner;
                System.out.println("Documentul " + document + " a fost printat!");
                isPrintat = true;
            }
        }
        else if(TipPrintare.ALBNEGRU == tip && this.isColor == false){
            if(nrToner < this.nivelToner) {
                this.nivelToner -=  nrToner;
                System.out.println("Documentul " + document + " a fost printat!");
                isPrintat = true;
            }
        }
        if(isPrintat == false) {
            throw  new ExceptiePrintare("Documentul nu a putut sa fie printat!");
        }

    }
}
