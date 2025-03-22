package ro.acs.main;

import ro.acs.clase.AgeTurRegistry;
import ro.acs.clase.Pachet;

public class Main {
    public static void main(String[] args) {
        AgeTurRegistry ageTurRegistry = AgeTurRegistry.getInstance(1000, 9090);
        AgeTurRegistry ageTurRegistry2 = AgeTurRegistry.getInstance(90898, 1871);
        Pachet pachet = ageTurRegistry.emitePachet(1);
        System.out.println(pachet.toString());
        Pachet pachet1 = ageTurRegistry.emitePachet(2);
        System.out.println(pachet1.toString());
        Pachet pachet2 = ageTurRegistry2.emitePachet(3);
        System.out.println(pachet2.toString());
        Pachet pachet3 = ageTurRegistry.emitePachet(4);
        System.out.println(pachet3.toString());
        Pachet pachet4 = ageTurRegistry.emitePachet(3);
        System.out.println(pachet4.toString());
        System.out.println(pachet2 == pachet4);
    }
}