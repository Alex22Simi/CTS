package ro.acs.composite.clase;

public interface IProdus {
    void afiseazaInformatii();
    public int getPret();
    public void addElement(IProdus nod);
    public void removeElement(IProdus nod);
    public IProdus getElement(int index);
}
