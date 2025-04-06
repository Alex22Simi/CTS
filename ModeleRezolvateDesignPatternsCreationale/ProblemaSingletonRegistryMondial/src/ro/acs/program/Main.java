package ro.acs.program;


import ro.acs.clase.Echipa;

public class Main {
    public static void main(String[] args) {
        Echipa e1 =Echipa.getInstancerRegistry(2);
        Echipa e2 =Echipa.getInstancerRegistry(2);

        System.out.println(e1.toString());
        System.out.println(e1 == e2);
    }
}