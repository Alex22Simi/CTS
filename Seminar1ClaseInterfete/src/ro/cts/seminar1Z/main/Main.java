package ro.cts.seminar1Z.main;


import ro.cts.seminar1Z.clase.*;
import ro.cts.seminar1Z.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentiList = new ArrayList<>();
        studentiList.add(new Student("Popescu", 21, 1,2));
        studentiList.add(new Student("Ionescu", 21,2,2));

        IPredabil profesor = new Profesor("Alin", 39, 1,12);

        Curs curs = new Curs("CTS", studentiList, profesor);
        curs.sustinereExamen();
        System.out.println();

        IPredabil asistent = new Asistent("Cosmina", 25,2, 3);
        curs.setProfesor(asistent);
        curs.sustinereExamen();
        System.out.println();

        ((Persoana)curs.getProfesor()).afiseazaModInvatare();
    }
}