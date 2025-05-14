package ro.acs.clase;

public class AnuntFaraDate extends AbstractAnunt{
    @Override
    public void trimiteAnunt(Client client) {
        if(!client.isAreNrTelefonSalvat() && !client.isAreAdresaEmailSalvata())  {
            System.out.println("Managerul este notificat: Clientul " + client.getNume() + " nu are nici numarul de telefon salvat nici adresa de email.");
        }
    }

}
