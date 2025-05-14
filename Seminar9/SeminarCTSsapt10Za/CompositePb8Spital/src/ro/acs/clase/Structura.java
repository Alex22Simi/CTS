package ro.acs.clase;

public interface Structura {
    void adaugaStructura(Structura structura) throws Exception;
    void stergeStructura(Structura structura) throws Exception;
    void afiseazaDescriere();
    Structura getStructura(int index) throws Exception;
}
