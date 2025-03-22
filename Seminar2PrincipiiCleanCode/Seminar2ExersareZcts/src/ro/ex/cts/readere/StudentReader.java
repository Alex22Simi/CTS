package ro.ex.cts.readere;

import ro.ex.cts.clase.Aplicant;
import ro.ex.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException, NumberFormatException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",|\n");
        List<Aplicant> students = new ArrayList<>();

        while (scanner.hasNext()) {
            Student student = new Student();
            super.readReloadData(scanner, student);
            int anStudii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            student.setAnStudii(anStudii);
            student.setFacultate(facultate);
            students.add(student);
        }
        scanner.close();
        return students;
    }
}
