package ro.acs.clase.ChainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class FiltruNote extends FiltruAbstract{
    @Override
    public List<Candidat> filtrare(List<Candidat> candidati) {
        //se considera eseul corect daca are o lungime impara
        List<Candidat> candidatiAdmis = new ArrayList<>();
        for(Candidat candidat : candidati) {
            if(candidat.getMedieBac() >=  6 && candidat.getMedieExamen() >= 5) {
                candidatiAdmis.add(candidat);
            }
        }
        System.out.println("Dupa filtrare eseu au ramas " + candidatiAdmis.size() + " candidati.");
        if(nextHandler != null) {
            return nextHandler.filtrare(candidatiAdmis);
        } else {
            System.out.println("S-a terminat filtrarea.");
            return candidatiAdmis;
        }
    }
}
