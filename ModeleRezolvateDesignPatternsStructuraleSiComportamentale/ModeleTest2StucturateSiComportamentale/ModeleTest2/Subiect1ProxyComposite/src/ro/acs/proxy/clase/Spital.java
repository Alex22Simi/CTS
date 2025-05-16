package ro.acs.proxy.clase;

public class Spital implements ISpital{
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public boolean verificaExistentaScrisoare(Vizitator v) {
      return v.isAreScrisoare();
    }

    @Override
    public boolean permiteAcces(Vizitator v) {
        return verificaExistentaScrisoare(v);
    }
}
