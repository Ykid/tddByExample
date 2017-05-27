package com.company;

/**
 * Created by david on 27/5/2017.
 */
public class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && (this.getClass() == object.getClass());
    }
}
