package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    int code;
    String name;
    String description;
    int price;
    int vat;

    public Prodotto(String name, String description, int price, int vat){
        Random numeroRandom = new Random();
        this.code = numeroRandom.nextInt(10000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    public int noVatPrice(){
        return this.price;
    }
    public double vatPrice(){
        return this.price + (this.price * vat / 100.0);
    }
    public String fullName(){
        return this.code +"-"+ this.name;
    }
}