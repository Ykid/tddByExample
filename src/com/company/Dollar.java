package com.company;

/**
 * Created by david on 27/5/2017.
 */
public class Dollar extends Money{
    public Dollar(int amount) {
        this.amount = amount;
    }
     Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
