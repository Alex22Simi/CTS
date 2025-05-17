package ro.acs.clase;

public class Spital implements ISpital{
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteVizitator(String numeVizitator, String numePacient) {
        System.out.println("Pacientul " + numePacient + " este vizitat de " + numeVizitator);
    }

    @Override
    public void reseteazaVizite() {
        System.out.println("Ziua s-a incheiat lista de vizitatori se va reseta.");
    }
}
