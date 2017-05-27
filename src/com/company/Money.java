package com.company;

/**
 * Created by david on 27/5/2017.
 */
abstract public class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && (this.getClass() == object.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }
    abstract Money times(int muliplier);
}
