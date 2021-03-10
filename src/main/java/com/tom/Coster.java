package com.tom;

public class Coster {
    String id;
    int cost;
    int discount;
    int amount;
    public Coster(String id,int cost,int discount,int amount){
        this.id = id;
        this.cost = cost;
        this.discount = discount;
        this.amount = amount;
    }
    public void print() {
        System.out.println(id + "\t" + cost + "\t\t" + discount +"\t\t\t"  + (cost - discount) );
    }
}
