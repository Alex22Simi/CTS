package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypePantofFactory {
    private static Map<EStilPantof, APantof> prototipuri = new HashMap<>();
    static {
        PantofPunck pantofPunck = new PantofPunck();
        prototipuri.put(EStilPantof.Punk, pantofPunck);

        PantofRock pantofRock = new PantofRock();
        prototipuri.put(EStilPantof.Rock, pantofRock);

        PantofPop pantofPop = new PantofPop();
        prototipuri.put(EStilPantof.Pop, pantofPop);
    }
    public static APantof getPrototipuri(EStilPantof tip) throws CloneNotSupportedException {
        if(prototipuri.containsKey(tip)) {
            return (APantof) prototipuri.get(tip).clone();
        }
        return null;
    }
}
