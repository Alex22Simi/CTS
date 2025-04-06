package ro.acs.clase;

public class Client extends ListaOferte{
    protected String categorieOferta;
    public Client() {
        super();
    }

    public Client(int nrOferte, float pretEstimativOferte, String numeClient, String categorieOferta) {
        super(nrOferte, pretEstimativOferte, numeClient);
        this.categorieOferta = categorieOferta;
    }

    @Override
    public ListaOferte cloneaza(String numeClient) {
        Client client = new Client();
        client.nrOferte = this.nrOferte;
        client.pretEstimativOferte = this.pretEstimativOferte;
        client.numeClient = numeClient;
        client.categorieOferta = this.categorieOferta;
        return client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrOferte=").append(nrOferte);
        sb.append(", pretEstimativOferte=").append(pretEstimativOferte);
        sb.append(", categorieOferta='").append(categorieOferta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
