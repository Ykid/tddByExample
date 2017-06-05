package com.company;

/**
 * Created by david on 27/5/2017.
 */
public class Money implements Expression {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && (this.currency.equals(money.currency));
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money times(int muliplier) {
        return new Money(this.amount * muliplier, this.currency);
    }

    String currency() {
        return this.currency;
    }

    public String toString() {
        return this.amount + " " + this.currency;
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    public Money reduce(String to) {
        return this;
    }
}
