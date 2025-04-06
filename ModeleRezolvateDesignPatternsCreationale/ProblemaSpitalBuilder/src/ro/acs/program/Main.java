package ro.acs.program;


import ro.acs.clase.Pacient;
import ro.acs.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder builder = new PacientBuilder();

        Pacient ionescu = builder.setHalat(true).build("Ionescu");
        Pacient dan = builder.build("Dan");

        System.out.println(ionescu.displayInfoPacient());
        System.out.println(dan.displayInfoPacient());
    }
}