package ro.acs.exercitiu1.clasa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student("TestStudent");
        System.out.println("Setup test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Teardown test");
    }

    @Test
    public void testMediaCorecta() throws ExceptieListaGoala, ExceptieNoteInsuficiente {
        student.adaugaNota(8);
        student.adaugaNota(10);
        student.adaugaNota(9);
        double rezultat = student.calculeazaMediaCelorMaiMariDouaNote();
        assertEquals(9.5, rezultat, 0.01);
    }

    @Test(expected = ExceptieListaGoala.class)
    public void testListaGoala() throws ExceptieListaGoala, ExceptieNoteInsuficiente {
        student.calculeazaMediaCelorMaiMariDouaNote();
    }

    @Test(expected = ExceptieNoteInsuficiente.class)
    public void testONotaSingura() throws ExceptieListaGoala, ExceptieNoteInsuficiente {
        student.adaugaNota(10);
        student.calculeazaMediaCelorMaiMariDouaNote();
    }

    @Test
    public void testNoteCuZeroSiNegative() throws ExceptieListaGoala, ExceptieNoteInsuficiente {
        student.adaugaNota(0);
        student.adaugaNota(-1);
        student.adaugaNota(6);
        student.adaugaNota(9);
        double rezultat = student.calculeazaMediaCelorMaiMariDouaNote();
        assertEquals(7.5, rezultat, 0.01);
    }
}