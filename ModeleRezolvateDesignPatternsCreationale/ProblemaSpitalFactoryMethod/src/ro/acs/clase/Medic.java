package ro.acs.clase;

public class Medic extends AbstractPersonal{
    private int sporPersonalMedical;

    public Medic(String nume, int vechime, int sporPersonalMedical) {
        super(nume, vechime);
        this.sporPersonalMedical = sporPersonalMedical;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("sporPersonalMedical=").append(sporPersonalMedical);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
