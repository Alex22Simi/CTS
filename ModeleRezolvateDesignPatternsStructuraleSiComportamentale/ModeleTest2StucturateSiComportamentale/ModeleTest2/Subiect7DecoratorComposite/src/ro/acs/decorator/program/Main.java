package ro.acs.decorator.program;


import ro.acs.decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        AbstractMagazin magazin = new Magazin("Adidas");

        Client client1 = new Client("Paul");
        Client client2 = new Client("Mihai");
        Client client3 = new Client("Marius");

        Comanda comanda1 = new Comanda(100.8, "Calimanesti");
        Comanda comanda2 = new Comanda(55.3, "Calimanesti");
        Comanda comanda3 = new Comanda(65.4, "Bucuresti");
        Comanda comanda4 = new Comanda(33.4, "Brasov");

        DecoratorDiscount discount = new DecoratorDiscount(magazin);
        System.out.println(discount.calculeazaTotal(client1, comanda1));
        System.out.println(discount.calculeazaTotal(client1, comanda2));
        System.out.println(discount.calculeazaTotal(client2, comanda3));
        System.out.println(discount.calculeazaTotal(client3, comanda4));
    }
}