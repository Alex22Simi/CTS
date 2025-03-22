package Principii.O.Clase;

public class HR {
    public boolean verificaPromovare(Angajat a) {
        if(a.getNume().length() %2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
