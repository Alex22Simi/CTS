package ro.acs.clase;

public class AnuntNumarTelefon extends AbstractAnunt{
    @Override
  public  void trimiteAnunt(Client client) {
        if(client.isAreNrTelefonSalvat()) {
            System.out.println("Clientul " + client.getNume() + " a fost anuntat de noua oferta prin numarul de telefon.");
        } else if(urmator != null) {
            System.out.println("Clientul " + client.getNume() + " nu are numarul de telefon salvat.");
            urmator.trimiteAnunt(client);
        }
    }
}
