package ro.acs.clase;

public class Stiker extends AStiker{
    public Stiker(Masina masinaDeStikeit, int dimensiune) {
        this.dimensiune = dimensiune;
        this.culoare = "Neagra";
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        AStiker clonaStiker = (AStiker) super.clone();
        clonaStiker.dimensiune = this.dimensiune;
        clonaStiker.culoare = this.culoare;
        return clonaStiker;
    }
}
