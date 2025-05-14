package ro.acs.program;


import ro.acs.clase.OcupareMasaStandard;
import ro.acs.clase.OcupareMasaTemplate;

public class Main {
    public static void main(String[] args) {
        OcupareMasaTemplate masa = new OcupareMasaStandard(true);
        masa.pregatireMasa();
    }
}