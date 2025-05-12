package ro.acs.clase;

import java.util.List;

public class Autobuz extends MijlocTransport{

    public Autobuz(int numarLinie) {
        super(numarLinie);

    }

    @Override
    public void pleacaDeLaCapat() {
       trimiteMesaj("Autobuzul numarul " + this.getNumarLinie() + " pleaca e la capatul liniei");
    }

    public void schimbaTraseul() {
        trimiteMesaj("Autobuzul cu numarul " + this.getNumarLinie() + " va circula astazi prin Bd. Balcescu si nu va mai opri la statia Piata Romana.");
    }
}
