package ro.acs.template.clase;

public class SpitalStat extends AbstractPrimiriUrgente{
    private int nrLocuriDisponibile = 5;

    @Override
    public void programeazaLaMedicFamilie() {
        System.out.println("Pacientul " + this.pacient.getNume() + " nu este in stare grava si a fost programat la medicul de familie de catre spitalul public.");
    }

    @Override
    public void interventieEchipaMedici() {
        if(pacient.isEsteInStareGrava()) {
            System.out.println("Medicii au intervenit deoarece pacientul " + this.pacient.getNume() +  " este in stare grava.");
        }
    }

    @Override
    public void disponibilitateLocSpital() {
        if(this.nrLocuriDisponibile > 0) {
            System.out.println("Pacientul " + this.pacient.getNume() + " a fost internat in spital, spitalul public avand " + this.nrLocuriDisponibile + " locuri disponibile.");
            this.nrLocuriDisponibile--;
        } else {
            System.out.println("Pacientul " + this.pacient.getNume() + "  nu a avut loc disponibil in acest spital de stat.");
        }
    }

    @Override
    public void cautaLocSpitalStatApropiat() {
        if(this.nrLocuriDisponibile <= 0) {
            System.out.println("Se cauta cel mai apropiat spital de stat cu paturi disponibile.");
        }
    }
}
