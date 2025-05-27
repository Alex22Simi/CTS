package ro.acs.exempluClasa.clase;

public class Masina {
    private String model;
    private double pret;
    private int nrKm;
    private int anFabricatie;

    public Masina(String model, double pret, int nrKm, int anFabricatie) {
        this.model = model;
        this.pret = pret;
        this.nrKm = nrKm;
        this.anFabricatie = anFabricatie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getNrKm() {
        return nrKm;
    }
    //sa vedem daca am implementat bine acest set nrKm
    //sa vedem daca nrKm > 0
    public void setNrKm(int nrKm) throws ExceptieNrKm {
        if(nrKm < 0) {
           // this.nrKm = nrKm;//asa e greseala
            throw new ExceptieNrKm();
        } else {
            this.nrKm = nrKm;
        }
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrKm=").append(nrKm);
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }
}
