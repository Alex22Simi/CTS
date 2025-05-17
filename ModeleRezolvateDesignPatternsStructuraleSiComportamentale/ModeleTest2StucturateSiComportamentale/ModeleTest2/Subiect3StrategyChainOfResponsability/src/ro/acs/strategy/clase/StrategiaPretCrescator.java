package ro.acs.strategy.clase;

import java.util.Comparator;
import java.util.List;

public class StrategiaPretCrescator implements IProdus{
    @Override
    public List<Produs> vizualizareProduse(List<Produs> listaProduse) {
        listaProduse.sort(Comparator.comparingInt(Produs::getPret));
        return listaProduse;
    }
}
