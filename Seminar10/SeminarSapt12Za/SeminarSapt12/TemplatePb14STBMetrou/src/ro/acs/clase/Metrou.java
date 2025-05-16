package ro.acs.clase;

public class Metrou extends AMetrou{
    private int nrMetrou;

    public Metrou(int nrMetrou) {
        this.nrMetrou = nrMetrou;
    }

    @Override
    public void opresteStatia1() {
        System.out.println("Metroul " + this.nrMetrou + " a oprit in statia 1.");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Metroul " + this.nrMetrou + " a oprit in statia 2.");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Metroul " + this.nrMetrou + " a oprit in statia 3.");
    }

    @Override
    public void opresteStatia4() {
        System.out.println("Metroul " + this.nrMetrou + " a oprit in statia 4.");
    }

    @Override
    public void opresteStatia5() {
        System.out.println("Metroul " + this.nrMetrou + " a oprit in statia 5.");
    }
}
