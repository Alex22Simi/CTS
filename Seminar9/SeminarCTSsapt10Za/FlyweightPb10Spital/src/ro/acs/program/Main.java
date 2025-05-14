package ro.acs.program;


import ro.acs.clase.FabricaPacienti;
import ro.acs.clase.PacientAbstract;
import ro.acs.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabrica = new FabricaPacienti();

        PacientAbstract pacient = fabrica.getPacient("Ion", "09782731", "ion@gmail.com");
        Spitalizare spitalizare = new Spitalizare(5, 7, 3);
        Spitalizare spitalizare2 = new Spitalizare(8, 3, 5);

        pacient.afiseazaPacient(spitalizare);
        pacient.afiseazaPacient(spitalizare2);

        Spitalizare spitalizare3 = new Spitalizare(7, 6, 7);
        Spitalizare spitalizare4 = new Spitalizare(9, 2, 6);
        fabrica.getPacient("Ioana", "91901901891", "ioana@gmail.com").afiseazaPacient(spitalizare3);
        fabrica.getPacient("09782731").afiseazaPacient(spitalizare4);

    }
}