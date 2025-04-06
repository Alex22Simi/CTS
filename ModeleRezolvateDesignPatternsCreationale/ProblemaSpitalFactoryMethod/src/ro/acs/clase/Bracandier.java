package ro.acs.clase;

public class Bracandier extends AbstractPersonal{
    private int sporPersonalMedical;

    public Bracandier(String nume, int vechime, int sporPersonalMedical) {
        super(nume, vechime);
        this.sporPersonalMedical = sporPersonalMedical;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bracandier{");
        sb.append("sporPersonalMedical=").append(sporPersonalMedical);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
