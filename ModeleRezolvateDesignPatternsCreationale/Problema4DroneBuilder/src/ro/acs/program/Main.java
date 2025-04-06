package ro.acs.program;

import ro.acs.clase.Drona;
import ro.acs.clase.DronaBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DronaBuilder builder = new DronaBuilder();

        Drona dronaAnonima = builder.build();
        System.out.println(dronaAnonima.toString());
        dronaAnonima.pretDronaDupaViteza();

        Drona dronaElvetiana = builder.setMaxSpeed(500).setModel("DronaElvetiana").build();
        System.out.println(dronaElvetiana.toString());
        dronaElvetiana.pretDronaDupaViteza();


    }
}