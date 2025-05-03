package ro.acs.clase;

public class NotaDePlata implements Nota{
    private float totalDePlata;

    public NotaDePlata(float totalDePlata) {
        this.totalDePlata = totalDePlata;
    }

    @Override
    public void printare() {
        System.out.println("Aveti de plata " + this.totalDePlata + " RON.");
    }
}
