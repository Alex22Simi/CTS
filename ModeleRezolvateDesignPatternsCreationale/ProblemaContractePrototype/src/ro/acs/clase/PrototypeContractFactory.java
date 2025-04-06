package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeContractFactory {
    private static Map<String, AContract> prototipuriContracte = new HashMap<>();
    static {
        ContractCorporate contractCorporate = new ContractCorporate();
        prototipuriContracte.put("Corporate", contractCorporate);

        ContractParty contractParty = new ContractParty();
        prototipuriContracte.put("Party", contractParty);

        ContractSportiv contractSportiv = new ContractSportiv();
        prototipuriContracte.put("Sportiv", contractSportiv);
    }

    public static AContract getPrototipContract(String tip) throws CloneNotSupportedException {
        if(prototipuriContracte.containsKey(tip)) {
            return (AContract) prototipuriContracte.get(tip).clone();
        }
        return null;
    }

}
