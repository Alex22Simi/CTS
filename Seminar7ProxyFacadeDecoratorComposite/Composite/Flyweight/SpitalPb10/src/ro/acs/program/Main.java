package ro.acs.program;

import ro.acs.clase.FabricaSpitalizari;
import ro.acs.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        //aici se creaza spitalul
        FabricaSpitalizari fabricaSpitalizari = new FabricaSpitalizari();
        fabricaSpitalizari.getPacient("Cosmina", "0831836613", "Aleea Suraia");
        fabricaSpitalizari.getPacient("Alex", "319813", "Mihail Moxa");
        fabricaSpitalizari.getPacient("Amalia", "12813981", "Pallady");
        fabricaSpitalizari.getPacient("Amalia", "244225", "daDAda");

        Spitalizare s1 = new Spitalizare(1, 3, 1);
        Spitalizare s2 = new Spitalizare(2, 3, 3);
        Spitalizare s3 = new Spitalizare(5, 7, 4);

        try {
            fabricaSpitalizari.getPacient("Cosmina").afiseazaInformatii(s1);
            fabricaSpitalizari.getPacient("Alex").afiseazaInformatii(s3);
            fabricaSpitalizari.getPacient("Amalia").afiseazaInformatii(s2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}