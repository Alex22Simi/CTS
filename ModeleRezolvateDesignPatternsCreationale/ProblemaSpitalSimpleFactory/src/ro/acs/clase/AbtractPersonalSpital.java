package ro.acs.clase;

public abstract class AbtractPersonalSpital implements IPersonalSpital{
    protected String nume;
    protected int varsta;
    protected String departament;

    public AbtractPersonalSpital(String nume, int varsta, String departament) {
        this.nume = nume;
        this.varsta = varsta;
        this.departament = departament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbtractPersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", departament='").append(departament).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
