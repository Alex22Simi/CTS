package ro.acs.clase.Strategy;

import ro.acs.clase.ChainOfResponsability.FiltruClasament;
import ro.acs.clase.ChainOfResponsability.FiltruEseu;
import ro.acs.clase.ChainOfResponsability.FiltruNote;

public class StrategiePrestabilita implements IStrategy{
    @Override
    public TehnicaFiltrare generareStrategie() {
        return new TehnicaFiltrare(new FiltruEseu(), new FiltruNote(), new FiltruClasament());
    }
}
