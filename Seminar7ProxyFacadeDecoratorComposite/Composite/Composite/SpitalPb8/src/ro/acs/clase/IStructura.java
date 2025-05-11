package ro.acs.clase;

public interface IStructura {
    void descriereStructura();
    void adaugaNod(IStructura structura);
    void stergeNod(IStructura structura);
    IStructura getCopilNod(int index);
}
