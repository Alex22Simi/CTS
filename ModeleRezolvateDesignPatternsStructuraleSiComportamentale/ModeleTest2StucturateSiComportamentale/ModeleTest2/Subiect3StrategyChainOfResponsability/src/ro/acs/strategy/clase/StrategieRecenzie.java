package ro.acs.strategy.clase;

import java.util.Iterator;
import java.util.List;

public class StrategieRecenzie implements IProdus{
    @Override
    public List<Produs> vizualizareProduse(List<Produs> listaProduse) {
        Iterator<Produs> iterator = listaProduse.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNrRecenzii() < 1) {
                iterator.remove();
            }
        }
        return listaProduse;
    }
}
