package ro.ex.cts.readere;

import ro.ex.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;

    public void readReloadData(Scanner scanner, Aplicant aplicant) {
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nrProiecte = scanner.nextInt();
        String[] proiecte = new String[5];
        for (int i = 0; i < nrProiecte; i++) {
            proiecte[i] = scanner.next();
        }
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nrProiecte, proiecte);
    }
}
