package ro.acs.composite.clase;

public  abstract class AbstractProdus implements IProdus{
    public void getInfo() {
        System.out.println("Sunt in stoc " + getNrBucati() + " de " + getNume());
    }
  public void addElement(AbstractProdus produs) {
      throw new UnsupportedOperationException("Nu exista element de adaugat.");
  }
  public void removeElement(AbstractProdus produs) {
      throw  new UnsupportedOperationException("Nu exista element de sters.");
  }
  public AbstractProdus getCopil(int index) {
      throw  new UnsupportedOperationException("Nu exista copil.");
  }

}
