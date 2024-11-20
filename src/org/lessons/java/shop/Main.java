package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto Snowboard = new Prodotto("Burton", "Freestyle", 530, 22);
        
        //Display methods
        System.out.println(Snowboard.noVatPrice());
        System.out.println(Snowboard.vatPrice());
        System.out.println(Snowboard.fullName());

        System.out.println("----------");

        //Display all variables
        System.out.println("Il codice del prodotto è: " + Snowboard.code);
        System.out.println("Il nome del prodotto è: " + Snowboard.name);
        System.out.println("La descrizione del prodotto è: " + Snowboard.description);
        System.out.println("Il prezzo del prodotto è: " + Snowboard.price);
        System.out.println("La percentuale di IVA che verrà applicata è di: " + Snowboard.vat +"%");
    }
}
