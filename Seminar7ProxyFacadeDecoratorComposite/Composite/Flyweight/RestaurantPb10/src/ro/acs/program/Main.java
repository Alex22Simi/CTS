package ro.acs.program;


import ro.acs.clase.FabricaClienti;
import ro.acs.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        FabricaClienti restaurant = new FabricaClienti();
        restaurant.getClienti("Cosmina", "198181", "cosmina@email");
        restaurant.getClienti("Alex", "23214351", "alex@email");
        restaurant.getClienti("Amalia", "2553245", "amalia@email");
        restaurant.getClienti("Alex", "35235325", "fafd@email");

        Rezervare rezervare1 = new Rezervare(2, 3, 18);
        Rezervare rezervare2 = new Rezervare(1, 2, 15);
        Rezervare rezervare3 = new Rezervare(4, 4, 20);

        try {
            restaurant.getClienti("Alex").afiseazaInformatii(rezervare1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}