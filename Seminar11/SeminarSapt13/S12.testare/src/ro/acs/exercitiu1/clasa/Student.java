package ro.acs.exercitiu1.clasa;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private List<Integer> note;

    public Student(String nume) {
        this.nume = nume;
        this.note = new ArrayList<>();
    }

    public void adaugaNota(int nota) {
        note.add(nota);
    }

    public double calculeazaMediaCelorMaiMariDouaNote() throws ExceptieListaGoala, ExceptieNoteInsuficiente {
        if (note.isEmpty()) {
            throw new ExceptieListaGoala("Lista de note este goala.");
        }

        Integer max1 = null;
        Integer max2 = null;

        for (int nota : note) {
            if (max1 == null || nota > max1) {
                if (max1 != null && !max1.equals(nota)) {
                    max2 = max1;
                }
                max1 = nota;
            } else if ((max2 == null || nota > max2) && nota != max1) {
                max2 = nota;
            }
        }

        if (max1 == null || max2 == null) {
            throw new ExceptieNoteInsuficiente("Sunt necesare cel putin doua note distincte.");
        }

        return (max1 + max2) / 2.0;
    }


    public List<Integer> getNote() {
        return note;
    }

    public String getNume() {
        return nume;
    }

}
