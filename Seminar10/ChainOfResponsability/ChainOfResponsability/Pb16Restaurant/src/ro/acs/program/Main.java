package ro.acs.program;

import ro.acs.clase.*;

public class Main {
    public static void main(String[] args) {
        Client alex = new Client("Alex", true, true);
        Client david = new Client("David", true, false);
        Client bogdan = new Client("Bogdan", false, true);
        Client spulber = new Client("Spulber", false, false);
        Client daniel = new Client("Daniel", false, true);

        AbstractAnunt anuntTelefon = new AnuntNumarTelefon();
        AbstractAnunt anuntEmail = new AnuntEmail();
        AbstractAnunt anuntFaraDate = new AnuntFaraDate();

        anuntTelefon.setUrmator(anuntEmail);
        anuntEmail.setUrmator(anuntFaraDate);

        anuntTelefon.trimiteAnunt(alex);
        System.out.println();
        anuntTelefon.trimiteAnunt(david);
        System.out.println();
        anuntTelefon.trimiteAnunt(bogdan);
        System.out.println();
        anuntTelefon.trimiteAnunt(spulber);
        System.out.println();
        anuntEmail.trimiteAnunt(daniel);

    }
}