package ro.acs.template.clase;

public abstract class AbstractVotare {
    protected Cetatean cetatean;
    protected abstract void verificaBuletin();
    protected abstract void verificareAdresa();
    protected abstract  void primireBuletinVotNormal();
    protected abstract  void primireBuletinVotListaSuplimentara();
    public final void voteaza(Cetatean cetatean) {
        this.cetatean = cetatean;
        verificaBuletin();
        verificareAdresa();
        if(!cetatean.isVoteazaLaSectiaAlocata()) {
            primireBuletinVotListaSuplimentara();
        } else {
            primireBuletinVotNormal();
        }
    }
}
