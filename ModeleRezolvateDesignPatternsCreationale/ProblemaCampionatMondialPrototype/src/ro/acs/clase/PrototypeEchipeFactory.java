package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeEchipeFactory {
    private static Map<String, AEchipaNationala> prototipuriEchipe = new HashMap<>();
    static {
        EchipaBrazilia echipaBrazilia = new EchipaBrazilia();
        prototipuriEchipe.put("Brazilia", echipaBrazilia);

        EcchipaArgentina echipaArgentina = new EcchipaArgentina();
        prototipuriEchipe.put("Argentina", echipaArgentina);

        EchipaGermania echipaGermania = new EchipaGermania();
        prototipuriEchipe.put("Germania", echipaGermania);
    }

    public static AEchipaNationala getPrototipEchipa(String numeEchipa) throws CloneNotSupportedException {
        if(prototipuriEchipe.containsKey(numeEchipa)) {
            return (AEchipaNationala) prototipuriEchipe.get(numeEchipa).clone();
        }
        return null;
    }
}
