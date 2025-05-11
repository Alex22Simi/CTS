package ro.acs.clase;

import java.util.HashMap;

public class FabricaSpitalizari {
    private HashMap<String, IPacient> listaPacientiSpitalizati;
    public FabricaSpitalizari() {
        this.listaPacientiSpitalizati = new HashMap<>();
    }
    public IPacient getPacient(String nume, String nrTelefon, String adresa) {
        //daca e un pacient nou prima data intra in acest hash map
        if(!listaPacientiSpitalizati.containsKey(nume)) {
            listaPacientiSpitalizati.put(nume, new Pacient(nume, nrTelefon, adresa));
        }
        return listaPacientiSpitalizati.get(nume);
    }

    public IPacient getPacient(String nume) throws Exception {
        if(listaPacientiSpitalizati.containsKey(nume)) {
           return  listaPacientiSpitalizati.get(nume);
        } else {
           throw  new Exception("Nu exista pacientul.");
        }
    }
}
