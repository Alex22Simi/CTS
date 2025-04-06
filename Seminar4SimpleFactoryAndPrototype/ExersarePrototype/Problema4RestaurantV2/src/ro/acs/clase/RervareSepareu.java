package ro.acs.clase;

public class RervareSepareu extends AbstractRezervare{
    private boolean doresteMasaExtinsa;
    public RervareSepareu() {
        super();
    }

    public RervareSepareu(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean doresteMasaExtinsa) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.doresteMasaExtinsa = doresteMasaExtinsa;
    }

    @Override
    public AbstractRezervare copiaza(int ziua) {
        RervareSepareu rezervare = new RervareSepareu();
        rezervare.ora = this.ora;
        rezervare.numeClient = this.numeClient;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.ziuaLunii = ziua;
        rezervare.doresteMasaExtinsa = this.doresteMasaExtinsa;
        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RervareSepareu{");
        sb.append("doresteMasaExtinsa=").append(doresteMasaExtinsa);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }
}
