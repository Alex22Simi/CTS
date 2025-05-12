package ro.acs.clase;

public class CardCalatorie implements IMetodaPlata{
    private int nrCalatoriiRamase;

    public CardCalatorie(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }

    @Override
    public void plataste(float pretBilet) {
        if(this.nrCalatoriiRamase > 0) {
            System.out.println("Ai platit cu cardul de calatorii.");
            this.nrCalatoriiRamase -= 1;
        } else {
            System.out.println("Nu mai sunt calatorii.");
        }
    }
}
