package ro.acs.clase;

public class ProxyOra implements IRezervare{
    private IRezervare rezervare;

    public ProxyOra(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int numarPersoane, int ora) {
        if(ora >= 18) {
            this.rezervare.rezerva(numeClient, numarPersoane, ora);
        } else {
            System.out.println("Nu este nevoie de rezervare, va asteptam!");
        }
    }
}
