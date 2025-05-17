package ro.acs.composite.clase;

public abstract class AbstractNod implements IProdus{

    @Override
    public void addElement(IProdus nod) {
        throw  new UnsupportedOperationException("Nu se poate adauga un produs.");
    }

    @Override
    public void removeElement(IProdus nod) {
        throw  new UnsupportedOperationException("Nu se poate sterge un produs.");
    }

    @Override
    public IProdus getElement(int index) {
        throw  new UnsupportedOperationException("Nu se poate realiza operatia.");
    }
}
