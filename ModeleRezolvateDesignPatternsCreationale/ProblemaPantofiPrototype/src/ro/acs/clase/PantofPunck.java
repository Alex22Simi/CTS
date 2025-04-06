package ro.acs.clase;

import java.util.ArrayList;

public class PantofPunck extends APantof{
    PantofPunck () {
        this.tipPantof = ETipPantof.Balerini;
        this.stilPantof = EStilPantof.Punk;
        this.listaMesaje = new ArrayList<>();
        listaMesaje.add("I like punck!");
        this.marimePantof = 35;
        this.culoare = "Negru";

    }
    @Override
    public void addMesaj(String mesaj) {
        int nrCaractere = 0;
        for(String m : listaMesaje) {
            nrCaractere += m.length();
        }
        nrCaractere += mesaj.length();
        if(nrCaractere > this.marimePantof) {
            throw new ExceptieMesajPantof("Caracterele de pantof nu trebuie sa depaseaza numarul pantofului.");
        }
        else {
            listaMesaje.add(mesaj);
        }
    }

    @Override
    public void calculeazaPret() {
        int pret = 100;
        if(this.marimePantof > 40 && this.tipPantof == ETipPantof.Stiletto) {
            pret += 100;
        }else if(this.listaMesaje.size() > 2) {
            pret += 25;
        }
        System.out.println("Pretul pantofului este de " + pret + " RON.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       APantof pantofClona = (APantof) super.clone();
        pantofClona.tipPantof = this.tipPantof;
        pantofClona.stilPantof = this.stilPantof;
        pantofClona.listaMesaje = new ArrayList<>(this.listaMesaje);
        pantofClona.marimePantof = this.marimePantof;
        pantofClona.culoare = this.culoare;
        return pantofClona;
    }
}
