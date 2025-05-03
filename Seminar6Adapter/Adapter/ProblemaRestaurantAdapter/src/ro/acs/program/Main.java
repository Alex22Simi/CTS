package ro.acs.program;


import ro.acs.clase.AdapterSoft;
import ro.acs.clase.ISoft;
import ro.acs.clase.SoftBar;
import ro.acs.clase.SoftBucatarie;

public class Main {
    public static void main(String[] args) {
        ISoft softBucatarie = new SoftBucatarie(1, 3500);
        softBucatarie.print();

        System.out.println();

        ISoft softBar = new AdapterSoft(new SoftBar(120));
        softBar.print();
    }
}