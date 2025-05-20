package ro.acs.template.clase;

public class SectieTara extends AbstractVotare{
    @Override
    protected void verificaBuletin() {
        System.out.println("Cetateanului " + this.cetatean.getNumeCetatean() + " ii s-a verificat buletinul.");
    }

    @Override
    protected void verificareAdresa() {
        System.out.println("Cetateanului " + this.cetatean.getNumeCetatean() + " ii s-a verificat adresa.");
    }

    @Override
    protected void primireBuletinVotNormal() {
            System.out.println("Cetateanul " + this.cetatean.getNumeCetatean() + " are adresa valabila pentru aceasta sectie de votare.");
    }

    @Override
    protected void primireBuletinVotListaSuplimentara() {
        System.out.println("Ceatateanul " + this.cetatean.getNumeCetatean() + " are adresa de votare pe alta sectie de votare, o sa fie trecut pe lista suplimentara.");
    }
}
