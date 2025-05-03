package ro.acs.program;


import ro.acs.clase.Masa;
import ro.acs.clase.Ospatar;
import ro.acs.clase.Picolo;
import ro.acs.clase.ReceptionistFatade;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(true, 20, 4);
        ReceptionistFatade receptionist = new ReceptionistFatade();

        String mesaj1 = receptionist.poateLuaLocLaMasa(masa1);
        System.out.println(mesaj1);

        System.out.println();

        Masa masa2 = new Masa(true, 23, 5);
        System.out.println(receptionist.poateLuaLocLaMasa(masa2));

        System.out.println();

        Masa masa3 = new Masa(true, 4, 2);
        System.out.println(receptionist.poateLuaLocLaMasa(masa3));


    }
}