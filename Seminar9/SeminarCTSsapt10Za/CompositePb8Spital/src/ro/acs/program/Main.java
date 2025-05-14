package ro.acs.program;


import ro.acs.clase.Departament;
import ro.acs.clase.Sectie;
import ro.acs.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura departament1 = new Departament("ORL", 34);
        Structura departament2 = new Departament("ICU", 23);
        Structura departament3 = new Departament("General", 45);

        Sectie sectie1 = new Sectie("Sectie1");
        Sectie sectie2 = new Sectie("sectie2");
        Sectie sectie3 = new Sectie("Sectie3");

        try {
            departament3.adaugaStructura(departament1);
            departament3.adaugaStructura(departament2);

            departament1.adaugaStructura(sectie1);
            departament2.adaugaStructura(sectie2);
            departament3.adaugaStructura(sectie3);

            departament3.afiseazaDescriere();
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}