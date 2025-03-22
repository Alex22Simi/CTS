package Principii.O.Program;


import Principii.O.Clase.Angajat;
import Principii.O.Clase.HR;

public class Main {
    public static void main(String[] args) {
        Angajat a = new Angajat("Gigel");
        HR hr = new HR();
        System.out.println(hr.verificaPromovare(a));
    }
}