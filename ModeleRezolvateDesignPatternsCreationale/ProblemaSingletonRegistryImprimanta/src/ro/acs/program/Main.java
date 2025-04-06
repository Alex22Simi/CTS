package ro.acs.program;

import ro.acs.clase.Imprimanta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Imprimanta i1 = Imprimanta.getInstanceImprimanta(1);
        Imprimanta i2 = Imprimanta.getInstanceImprimanta(2);
        Imprimanta i3 = Imprimanta.getInstanceImprimanta(2);
        System.out.println(i1.toString());
        System.out.println(i2.toString());
        System.out.println(i1 == i2);
        System.out.println(i3.toString());
        System.out.println(i3 == i2);
    }
}