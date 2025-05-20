package ro.acs.template.clase;

public class Cetatean {
    private String numeCetatean;
    private boolean voteazaLaSectiaAlocata;

    public Cetatean(String numeCetatean, boolean voteazaLaSectiaAlocata) {
        this.numeCetatean = numeCetatean;
        this.voteazaLaSectiaAlocata = voteazaLaSectiaAlocata;
    }

    public String getNumeCetatean() {
        return numeCetatean;
    }

    public boolean isVoteazaLaSectiaAlocata() {
        return voteazaLaSectiaAlocata;
    }
}
