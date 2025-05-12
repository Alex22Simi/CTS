package ro.acs.clase;

public interface Observabil {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteMesaj(String mesaj);
}
