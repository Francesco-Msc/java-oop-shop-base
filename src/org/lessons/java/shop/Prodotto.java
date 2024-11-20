package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    int codice;
    String nome;
    String descrizione;
    int prezzo;
    int iva;

    public Prodotto(int codice, String nome, String descrizione, int prezzo, int iva){
        Random numeroRandom = new Random();
        this.codice = numeroRandom.nextInt(10000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int prezzoIntero(){
        return this.prezzo;
    }
}