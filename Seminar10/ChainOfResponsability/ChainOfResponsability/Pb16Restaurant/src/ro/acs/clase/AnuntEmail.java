package ro.acs.clase;

public class AnuntEmail extends AbstractAnunt{
    @Override
    public void trimiteAnunt(Client client) {
        if(client.isAreAdresaEmailSalvata()) {
            System.out.println("Clientul " + client.getNume() + " a fost anuntat de noua oferta prin adresa de email.");
        } else if(urmator != null) {
            System.out.println("Clientul " + client.getNume() + " nu are adresa de email salvata.");
            urmator.trimiteAnunt(client);
        }
    }
}
