package ro.ex.cts.readere;

import ro.ex.cts.clase.Angajat;
import ro.ex.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat angajat = new Angajat();
            super.readReloadData(scanner, angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}
