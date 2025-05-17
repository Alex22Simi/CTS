package ro.acs.template.clase;

public class SpitalPrivat extends AbstractPrimiriUrgente{
    private int nrLocuriDisponibile = 7;
    @Override
    public void programeazaLaMedicFamilie() {
        System.out.println("Pacientul " + this.pacient.getNume() + " nu este in stare grava si a fost programat la medicul de familie de catre spitalul privat.");
    }

    @Override
    public void interventieEchipaMedici() {
        if(pacient.isEsteInStareGrava()) {
            System.out.println("A intervenit o echipa de medici externi deoarece pacientul  " + this.pacient.getNume() +  " este in stare grava.");
        }
    }

    @Override
    public void disponibilitateLocSpital() {
        if(this.nrLocuriDisponibile > 0) {
            System.out.println("Pacientul " + this.pacient.getNume() + " a fost internat in spitalul privat avand " + this.nrLocuriDisponibile + " locuri disponibile.");
            this.nrLocuriDisponibile--;
        } else {
            System.out.println("Pacientul " + this.pacient.getNume() + "  nu a avut loc disponibil in acest spital privat.");
        }
    }

    @Override
    public void cautaLocSpitalStatApropiat() {
        if(this.nrLocuriDisponibile <= 0) {
            System.out.println("Se cauta cel mai apropiat spital privat cu paturi disponibile.");
        }
    }
}
