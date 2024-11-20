package org.lessons.java.shop;

public class Prodotto {
    int codice;
    String nome;
    String descrizione;
    String prezzo;
    int iva;

    public Prodotto(int codice, String nome, String descrizione, String prezzo, int iva){
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
}
