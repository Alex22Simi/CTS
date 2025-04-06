package ro.acs.clase;

public class Secretar extends AbstractPersonal{
    private int sporPersonalNonMedical;

    public Secretar(String nume, int vechime, int sporPersonalNonMedical) {
        super(nume, vechime);
        this.sporPersonalNonMedical = sporPersonalNonMedical;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Secretar{");
        sb.append("sporPersonalNonMedical=").append(sporPersonalNonMedical);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
