package ro.acs.clase;

public class Pachet {
    private int idPachet;
    private String data;
    private int nrPachet;

    protected Pachet(int idPachet, String data, int nrPachet) {
        this.idPachet = idPachet;
        this.data = data;
        this.nrPachet = nrPachet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pachet{");
        sb.append("idPachet=").append(idPachet);
        sb.append(", data='").append(data).append('\'');
        sb.append(", nrPachet=").append(nrPachet);
        sb.append('}');
        return sb.toString();
    }
}
