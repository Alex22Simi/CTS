package ro.acs.exempluClasa.clase;

import org.junit.Test;

import static org.junit.Assert.*;

public class MasinaTest {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("Set up");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("Tear down");
    }

    @Test
    public void test1() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(300);
        System.out.println("Test1");
    }

    @Test(expected = ExceptieNrKm.class)
    public void test2() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(-300);
    }

    //inca un test care sa pice in situatia in care arunc -300(numar negativ)
    @Test()
    public void test3() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(300);
        assertEquals("Verif cu nr Km normal", 300, m.getNrKm());
    }

    @Test(expected = ExceptieNrKm.class)
    public void test4() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(-300);
        assertEquals("Verif cu nr Km negativ", 200, m.getNrKm());
    }

    @Test
    public void test5()  {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        try {
            m.setNrKm(-300);
            // 1 NU e bine
           //assertTrue(false);
            fail("Nu arunca exceptie chiar daca am trimis nr km negativ.");
        } catch(ExceptieNrKm e) {
           //2 e bine
            assertTrue(true);
        }
        assertEquals("s-a modificat nr km pe apel set cu nr km negativ", 200, m.getNrKm());
    }

}