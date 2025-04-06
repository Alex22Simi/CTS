package ro.acs.clase;

public abstract class ListaOferte {
    protected int nrOferte;
    protected float pretEstimativOferte;
    protected String numeClient;
    public ListaOferte() {
        this.nrOferte = 1;
        this.pretEstimativOferte = 2;
        this.numeClient = "Anonim";
    }

    public ListaOferte(int nrOferte, float pretEstimativOferte, String numeClient) {
        if(nrOferte > 1) {
            this.nrOferte = nrOferte;
        }  else {
            this.nrOferte = 1;
        }
        if(pretEstimativOferte > 10) {
            this.pretEstimativOferte = pretEstimativOferte;
        } else {
            this.pretEstimativOferte = 1;
        }
        if(numeClient.length() > 3) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Anonim";
        }
    }
    public abstract ListaOferte cloneaza(String numeClient);
}
