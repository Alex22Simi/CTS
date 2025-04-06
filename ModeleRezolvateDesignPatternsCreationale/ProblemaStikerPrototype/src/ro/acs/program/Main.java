package ro.acs.program;


import ro.acs.clase.AStiker;
import ro.acs.clase.Masina;
import ro.acs.clase.PrototypeStikerFactory;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Masina m = new Masina("BMW", 2020);
        AStiker stiker = PrototypeStikerFactory.getStiker(m.getCodUnic());

        System.out.println(stiker.toString());
    }
}