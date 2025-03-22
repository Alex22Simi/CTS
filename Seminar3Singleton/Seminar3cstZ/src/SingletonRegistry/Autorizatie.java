package SingletonRegistry;

public class Autorizatie {
    private String detinator;
    private  String data;
    private int nrAutorizatie;

     Autorizatie(String detinator, String data, int nrAutorizatie) {
        this.detinator = detinator;
        this.data = data;
        this.nrAutorizatie = nrAutorizatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autorizatie{");
        sb.append("detinator='").append(detinator).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", nrAutorizatie=").append(nrAutorizatie);
        sb.append('}');
        return sb.toString();
    }
}
