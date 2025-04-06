package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class Cuptor extends  ACuptor{
    private int gradeMaxime;
    private List<Comanda> listaComenzi;
    private static Cuptor instance = null;
    private Cuptor() {
        this.gradeMaxime = 450;
        this.listaComenzi = new ArrayList<>();
    }

    public static Cuptor getInstance() {
        if(instance == null) {
            instance = new Cuptor();
        }
        return instance;
    }

    @Override
    public int getGradeMaxime() {
        return this.gradeMaxime;
    }

    @Override
    public int getTimpAsteptare() {
        int timpAsteptare = 0;
        for(Comanda c : listaComenzi) {
            timpAsteptare += c.getTimpGatire();
        }
        return timpAsteptare;
    }

    @Override
    public void afisareComenziAsteptare() {
        for(Comanda c : listaComenzi) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void addComanda(Comanda c) {
        listaComenzi.add(c);
    }
}
