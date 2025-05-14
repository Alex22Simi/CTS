package ro.acs.program;


import ro.acs.clase.AbstractInternare;
import ro.acs.clase.Pacient;
import ro.acs.clase.Salon;
import ro.acs.clase.VerificareGravitate;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("David", 5);
        Pacient pacient1 = new Pacient("Alex", 5);
        Pacient pacient2 = new Pacient("Bogdan", 1);
        Pacient pacient3 = new Pacient("Daniel", 5);

        Salon salon = new Salon(2);

        AbstractInternare verificare = new VerificareGravitate();
        verificare.setUrmator(salon);

        verificare.verifica(pacient);
        System.out.println();
        verificare.verifica(pacient1);
        System.out.println();
        verificare.verifica(pacient2);
        System.out.println();
        verificare.verifica(pacient3);

    }
}