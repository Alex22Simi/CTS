package ro.acs.template.program;

import ro.acs.template.clase.AbstractVotare;
import ro.acs.template.clase.Cetatean;
import ro.acs.template.clase.SectieStrainatate;
import ro.acs.template.clase.SectieTara;

public class Main {
    public static void main(String[] args) {
        AbstractVotare sectieTara = new SectieTara();
        AbstractVotare sectieStrainatate = new SectieStrainatate();

        Cetatean cetatean1 = new Cetatean("Alex", false);
        Cetatean cetatean2 = new Cetatean("Alin", true);
        Cetatean cetatean3 = new Cetatean("Mihai", false);
        Cetatean cetatean4 = new Cetatean("Mircea", true);

        sectieTara.voteaza(cetatean1);
        System.out.println();
        sectieTara.voteaza(cetatean2);
        System.out.println();
        System.out.println();

        sectieStrainatate.voteaza(cetatean3);
        System.out.println();
        sectieStrainatate.voteaza(cetatean4);
    }
}
