package ro.acs.clase;

public class MedicamentSpital {
    private float pret;
    private String nume;

    public MedicamentSpital(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }
    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + this.nume + " a fost achizitionat la pretul de " + this.pret);
    }
    public void prezintaReteta() {
        System.out.println("Aceasta este reteta pentru medicamentul " + this.nume);
    }
}
