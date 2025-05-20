package ro.acs.template.clase;

public class SectieStrainatate extends AbstractVotare{
    @Override
    protected void verificaBuletin() {
        System.out.println("Cetateanului roman care voteaza in diaspora, " + this.cetatean.getNumeCetatean() + " ii s-a verificat buletinul.");
    }

    @Override
    protected void verificareAdresa() {
        System.out.println("Cetateanului roman care voteaza in diaspora" + this.cetatean.getNumeCetatean() + " ii s-a verificat adresa.");
    }

    @Override
    protected void primireBuletinVotNormal() {
            System.out.println("Cetateanul roman care voteaza in diaspora" + this.cetatean.getNumeCetatean() + " voteaza la sectia alocata.");

    }

    @Override
    protected void primireBuletinVotListaSuplimentara() {
        System.out.println("Ceatateanul roman care voteaza in diaspora " + this.cetatean.getNumeCetatean() + " are adresa de votare pe alta sectie de votare, o sa fie trecut pe lista suplimentara.");
    }
}
