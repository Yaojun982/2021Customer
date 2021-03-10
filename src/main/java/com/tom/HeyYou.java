package com.tom;

public class HeyYou {
    public static void main(String[] args){

        System.out.println("Customer Cost  Discount   Amount ");
        Coster[] costers = {
                new Coster("0013",490,0,490),
                new Coster("0052",1000,100,900),
                new Coster("0081",290,0,290),
                new Coster("2122",2000,200 ,1800)
        };
        for (int i = 0; i < costers.length; i++) {
            costers[i].print();
        }

    }
}
