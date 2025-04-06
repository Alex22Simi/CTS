package ro.acs.program;


import ro.acs.clase.AbstractAirQualityReport;
import ro.acs.clase.RaportFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduceti nivelul de particule: ");
        Scanner scanner  = new Scanner(System.in);
        int valoareParticule = scanner.nextInt();

        AbstractAirQualityReport raport = RaportFactory.getReport(valoareParticule);
        raport.genereazaRaport();
    }
}