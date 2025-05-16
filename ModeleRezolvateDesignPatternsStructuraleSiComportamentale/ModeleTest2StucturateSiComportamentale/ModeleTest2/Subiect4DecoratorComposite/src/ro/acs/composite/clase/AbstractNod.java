package ro.acs.composite.clase;

public abstract class AbstractNod implements IProdus{
    public  abstract void afiseazaInformatii();
    @Override
    public void addElement(IProdus nod) {
        throw new UnsupportedOperationException("Nu exista element de adaugat.");
    }

    @Override
    public void removeElement(IProdus nod) {
        throw new UnsupportedOperationException("Nu exista element de sters.");
    }

    @Override
    public IProdus getElement(int index) {
       throw new UnsupportedOperationException("Nu se poate cauta copilul.") ;
    }
}
