package ro.acs.clase;

public class PacientBuilder implements IBuild{
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public PacientBuilder() {

    }



    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public PacientBuilder setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public PacientBuilder setPapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public PacientBuilder setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }
   public void reset() {
        this.numePacient = "Anonim";
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuci = false;
        this.halat = false;
   }

    @Override
    public Pacient build(String numePacient) {
        Pacient pacient = new Pacient(numePacient, this.patRabatabil, this.micDejun, this.papuci, this.halat);
        reset();
        return pacient;
    }
}
