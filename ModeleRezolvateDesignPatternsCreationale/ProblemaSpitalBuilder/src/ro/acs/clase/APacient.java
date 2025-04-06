package ro.acs.clase;

public abstract class APacient {
    protected String numePacient;
    protected boolean patRabatabil;
    protected boolean micDejun;
    protected boolean papuci;
    protected boolean halat;

    public APacient(String numePacient, boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat) {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
    }

    public abstract String displayInfoPacient();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("APacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuci=").append(papuci);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }
}
