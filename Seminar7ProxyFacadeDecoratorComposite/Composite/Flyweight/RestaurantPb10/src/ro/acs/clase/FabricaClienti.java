package ro.acs.clase;

import java.util.HashMap;

public class FabricaClienti {
    private HashMap<String, IClient> clienti;

    public FabricaClienti() {
        this.clienti = new HashMap<>();
    }

    public IClient getClienti(String nume, String nrTelefon, String adresaMail) {
        if(!clienti.containsKey(nume)) {
            clienti.put(nume, new Client(nume, nrTelefon, adresaMail));
        }
        return clienti.get(nume);
    }

    public IClient getClienti(String nume) throws Exception {
        if(clienti.containsKey(nume)) {
            return clienti.get(nume);
        } else {
            throw  new Exception("Nu exista clientul.");
        }
    }
}
