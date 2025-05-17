package ro.acs.decorator.clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DecoratorDiscount extends AsbtractDecorator{
    private double valoareaDiscount = 0.9;
    private HashMap<String, ArrayList<Comanda>> comenziClient = new HashMap<>();
    public DecoratorDiscount(AbstractMagazin magazin) {
        super(magazin);
    }

    @Override
    public double calculeazaTotal(Client client, Comanda comanda) {
        if(!comenziClient.containsKey(client.getNume())) {
            comenziClient.put(client.getNume(), new ArrayList<>());
            comenziClient.get(client.getNume()).add(comanda);
            System.out.println("Discount aplicat pentru prima comanda a clientului " + client.getNume() + ":");
            return this.valoareaDiscount * super.calculeazaTotal(client, comanda);
        } else {
            comenziClient.get(client.getNume()).add(comanda);
        }
        return super.calculeazaTotal(client, comanda);
    }
}
