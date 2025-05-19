package ro.acs.template.clase;

public class SpitalPrivat extends AbstractPrimiriUrgente{
    private int nrLocuriDisponibile = 7;
    @Override
    protected void programeazaLaMedicFamilie() {
        System.out.println("Pacientul " + pacient.getNume() + " a fost programat la medicul de familie de catre spitalul privat.");
    }

    @Override
    protected void interventieMedici() {
        System.out.println("A intervenit o echipa de medici externi pentru stabilizarea pacientului.");
    }

    @Override
    protected void verificareDisponibiliatetLocSpital() {
        if(this.nrLocuriDisponibile > 0) {
            System.out.println("Pacientul " + this.pacient.getNume() + " a fost internat in spital, spitalul privat avand " + this.nrLocuriDisponibile + " locuri disponibile.");
            this.nrLocuriDisponibile--;
        } else {
            System.out.println("Pacientul " + this.pacient.getNume() + "  nu a avut loc disponibil in acest spital  privat.");
        }
    }

    @Override
    protected void cautaLocSpitalApropiat() {
        if(this.nrLocuriDisponibile <= 0) {
            System.out.println("Se cauta cel mai apropiat spital privat cu paturi disponibile.");
        }
    }
}
