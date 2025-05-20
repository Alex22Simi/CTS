package ro.acs.chain.clase;

public class Bancnota20 extends AbstractBancnota{
    private int nrBancnote;

    public Bancnota20(int nrBancnote) {
        this.nrBancnote = nrBancnote;
    }

    @Override
    public void retrage(int suma) {
        int necesar = Math.min(suma / 20, nrBancnote);
        int rest = suma - necesar * 20;

        if (necesar > 0) {
            System.out.println("S-au retras " + necesar + " bancnote de 20 lei.");
            nrBancnote -= necesar;
        }

        if (rest > 0) {
            if (getUrmatoare() != null) {
                getUrmatoare().retrage(rest);
            } else {
                System.out.println("Nu se poate retrage suma completă. Suma rămasă: " + rest + " lei.");
            }
        }
    }
}
