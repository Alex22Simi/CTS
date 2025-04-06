package ro.acs.clase;

public class Registrator extends AbstractPersonal{
    private int sporPersonalNonMedical;

    public Registrator(String nume, int vechime, int sporPersonalNonMedical) {
        super(nume, vechime);
        this.sporPersonalNonMedical = sporPersonalNonMedical;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Registrator{");
        sb.append("sporPersonalNonMedical=").append(sporPersonalNonMedical);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
