package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class Cuptor extends  ACuptor{
    //static block
    private int gradeMaxime;
    private List<Comanda> listaComenzi;
    private static Cuptor instance = null;

    private Cuptor() {
        this.gradeMaxime = 180;
        this.listaComenzi = new ArrayList<>();
    }

    static {
        instance = new Cuptor();
    }

    public static Cuptor getInstance() {
        return instance;
    }


    @Override
    public int getGradeMaxime() {
        return this.gradeMaxime;
    }

    @Override
    public int getTimpAsteptare() {
        int timp = 0;
        for(Comanda comenzi : listaComenzi) {
            timp += comenzi.getTimpGatire();
        }
        return timp;
    }

    @Override
    public void afisareComenziAsteptare() {
        for(Comanda c : listaComenzi) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void addComanda(Comanda c) {
        if(this.gradeMaxime < c.getGradeGatire()) {
           throw  new ExceptieGatire("Cuptor nu suporta atatea grade!");
        }
        listaComenzi.add(c);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("gradeMaxime=").append(gradeMaxime);
        sb.append(", listaComenzi=").append(listaComenzi);
        sb.append('}');
        return sb.toString();
    }
}
