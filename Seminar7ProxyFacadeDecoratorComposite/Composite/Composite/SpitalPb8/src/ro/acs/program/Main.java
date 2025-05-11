package ro.acs.program;

import ro.acs.clase.DepartamentComposite;
import ro.acs.clase.IStructura;
import ro.acs.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        IStructura departament = new DepartamentComposite("Departament general");
        IStructura departament2 = new DepartamentComposite("Cardiologie");
        IStructura departament3 = new DepartamentComposite("Pediatrie");
        IStructura sectie1 = new Sectie("Sectie1");
        IStructura sectie2 = new Sectie("Sectie2");

        departament.adaugaNod(departament2);
        departament.adaugaNod(departament3);

        departament2.adaugaNod(sectie1);
        departament3.adaugaNod(sectie2);

        departament2.descriereStructura();
        departament2.stergeNod(sectie1);
        departament2.descriereStructura();

    }
}