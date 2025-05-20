package ro.acs.chain.clase;

public class Bancnota10 extends AbstractBancnota{
    private int nrBancnote;

    public Bancnota10(int nrBancnote) {
        this.nrBancnote = nrBancnote;
    }

    @Override
    public void retrage(int suma) {
        int necesar = Math.min(suma / 10, nrBancnote);
        int rest = suma - necesar * 10;

        if (necesar > 0) {
            System.out.println("S-au retras " + necesar + " bancnote de 10 lei.");
            nrBancnote -= necesar;
        }

        if (rest > 0) {
            System.out.println("Nu se poate retrage suma completă. Suma rămasă: " + rest + " lei.");
        }
    }
}
