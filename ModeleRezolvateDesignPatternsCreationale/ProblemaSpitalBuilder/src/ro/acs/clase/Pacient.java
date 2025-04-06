package ro.acs.clase;

public class Pacient extends APacient{

     Pacient(String numePacient, boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat) {
        super(numePacient, patRabatabil, micDejun, papuci, halat);
    }


    @Override
    public String displayInfoPacient() {
        return this.toString();
    }
}
