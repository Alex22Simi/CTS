package ro.acs.proxy.clase;

import java.util.ArrayList;
import java.util.List;

public class ProxySpital implements ISpital{
    private ISpital spital;
    private List<Vizitator> vizitatori;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
        this.vizitatori = new ArrayList<>();
    }

    @Override
    public boolean verificaExistentaScrisoare(Vizitator v) {
        return spital.verificaExistentaScrisoare(v);
    }

    @Override
    public boolean permiteAcces(Vizitator v) {
        if(verificaExistentaScrisoare(v) == false) {
            System.out.println("Vizitatorul " + v.getNume() + " nu are scrisoare medicala.");
            return false;
        } else {
            vizitatori.add(v);
        }
       if(vizitatori.size() >= 5) {
           for(Vizitator vizitatorInSala : vizitatori) {
               System.out.println(vizitatorInSala.getNume() + " a fost echipat si are acces in salon.");
           }
           vizitatori.clear();
           return true;
       } else {
           System.out.println(v.getNume() + " trebuie sa astepte pana cand sala de asteptare este ocupata de minim 5 persoane, deocamdata numarul de pacienti aflati in sala de asteptare este: " + vizitatori.size() + ".");
       }
       return false;
    }
}
