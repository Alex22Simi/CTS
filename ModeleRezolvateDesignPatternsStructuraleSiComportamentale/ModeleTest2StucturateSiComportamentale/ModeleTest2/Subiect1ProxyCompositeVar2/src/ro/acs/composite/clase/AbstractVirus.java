package ro.acs.composite.clase;

public abstract class AbstractVirus implements IVirus{
    public abstract void afiseazaInfo();
    public  void addElement(AbstractVirus virus) {
        throw new UnsupportedOperationException("Nu exista element de adaugat.");
    }
    public  void removeElement(AbstractVirus virus) {
        throw  new UnsupportedOperationException("Nu exista element de sters.");
    }
    public  AbstractVirus getCopil(int index) {
        throw  new UnsupportedOperationException("Nu exista copil.");
    }
}
