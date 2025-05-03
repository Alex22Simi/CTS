package ro.acs.clase;

public class NumarPersoaneProxy implements IRezervare{
    private IRezervare rezervare;

    public NumarPersoaneProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int numarPersoane, int ora) {
        if(numarPersoane > 4) {
            this.rezervare.rezerva(numeClient, numarPersoane, ora);
        } else {
            System.out.println("Va asteptam la restaurant!");
        }
    }
}
