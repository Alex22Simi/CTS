package ro.acs.clase;

public class AdapterMedicament implements IMedicament {
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Adaptare medicamente farmacie la medicamente spital.");
        medicamentSpital.achizitioneazaMedicament();
    }
}
