package ro.ex.cts.main;

import ro.ex.cts.clase.Angajat;
import ro.ex.cts.clase.Aplicant;
import ro.ex.cts.readere.AngajatReader;
import ro.ex.cts.readere.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        AplicantReader aplicantReader = new AngajatReader();
        try {
            listaAplicanti = aplicantReader.readAplicanti("angajati.txt");
            for (Aplicant aplicant : listaAplicanti) {
                System.out.println(aplicant.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
