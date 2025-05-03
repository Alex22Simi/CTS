package ro.acs.clase;

public class Rezervare implements IRezervare{

    @Override
    public void rezerva(String numeClient, int numarPersoane, int ora) {
        System.out.println(numeClient + " are o rezervare de " + numarPersoane + " la ora " + ora);
    }
}
