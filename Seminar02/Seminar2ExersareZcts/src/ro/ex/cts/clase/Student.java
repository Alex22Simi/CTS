package ro.ex.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;
    private static int sumaFinantata = 20;

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAnStudii() {
        return anStudii;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    public static int getSumaFinantata() {
        return sumaFinantata;
    }

    public Student() {
        super();

    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte,
                   String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta +
                ", Punctaj=" + punctaj + ", NrProiecte=" + nr_proiecte + "," +
                "DenumireProiect=" + Arrays.toString(denumireProiect) + "Facultate=" + facultate +
                ", AnStudii=" + anStudii;
    }

    public void afiseazaInformatiiFinantare() {
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantata +
                " Euro/zi in proiect.");
    }

}
