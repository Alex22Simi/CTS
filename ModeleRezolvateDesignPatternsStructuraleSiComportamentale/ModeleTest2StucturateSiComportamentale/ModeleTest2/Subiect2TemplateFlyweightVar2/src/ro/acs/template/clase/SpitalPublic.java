package ro.acs.template.clase;

public class SpitalPublic extends AbstractPrimiriUrgente{
    private int nrLocuriDisponibile = 2;

    @Override
    protected void programeazaLaMedicFamilie() {
        System.out.println("Pacientul " + pacient.getNume() + " a fost programat la medicul de familie de catre spitalul public.");
    }

    @Override
    protected void interventieMedici() {
            System.out.println("Medicii din spitalul public au intervenit pentru stabilizarea pacientului.");
    }

    @Override
    protected void verificareDisponibiliatetLocSpital() {
        if(this.nrLocuriDisponibile > 0) {
            System.out.println("Pacientul " + this.pacient.getNume() + " a fost internat in spital, spitalul public avand " + this.nrLocuriDisponibile + " locuri disponibile.");
            this.nrLocuriDisponibile--;
        } else {
            System.out.println("Pacientul " + this.pacient.getNume() + "  nu a avut loc disponibil in acest spital de stat.");
        }
    }

    @Override
    protected void cautaLocSpitalApropiat() {
        if(this.nrLocuriDisponibile < 0) {
            System.out.println("Se cauta cel mai apropiat spital de stat cu paturi disponibile.");
        }
    }
}
