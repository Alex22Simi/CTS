package ro.acs.composite.clase;

public interface INod extends Virus{
    public void afiseazaInfo();
    public void adaugaNod(INod nod);
    public void stergeNod(INod nod);
    public INod getNodCopil(int index);
}
