package com.company;

/**
 * Created by david on 27/5/2017.
 */
public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
