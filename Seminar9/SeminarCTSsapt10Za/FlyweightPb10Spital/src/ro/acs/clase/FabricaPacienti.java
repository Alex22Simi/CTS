package ro.acs.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String, PacientAbstract> colectiePacienti;
    public FabricaPacienti() {
        this.colectiePacienti = new HashMap<String, PacientAbstract>();
    }
    public PacientAbstract getPacient(String telefon) throws Exception {
        PacientAbstract pacient = colectiePacienti.get(telefon);
        if(pacient == null) {
           throw  new Exception("Pacientul nu exista!");
        }
        return pacient;
    }

    public PacientAbstract getPacient(String nume, String numarTelefon, String adresaEmail) {
        PacientAbstract pacient = colectiePacienti.get(numarTelefon);
        if(pacient == null) {
            pacient = new Pacient(nume, adresaEmail, numarTelefon);
            colectiePacienti.put(numarTelefon, pacient);
        }
        return pacient;
    }
}
