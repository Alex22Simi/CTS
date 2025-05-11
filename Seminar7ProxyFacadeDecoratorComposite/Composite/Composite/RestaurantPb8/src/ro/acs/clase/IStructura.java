package ro.acs.clase;

public interface IStructura {
    void descriereStructura();
    //metode specifice pentru nodurile frunza
    void adaugaNod(IStructura structura);
    void stergeNod(IStructura structura);
    IStructura getCopilNod(int index);
}
