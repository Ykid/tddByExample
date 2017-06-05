package com.company;

/**
 * Created by david on 5/6/2017.
 */
public class Sum implements Expression {
    Money augend;
    Money addend;
    Sum(Money augend, Money addend) {
        this.addend = addend;
        this.augend = augend;
    }

    public Money reduce(Bank bank, String to) {
        return new Money(augend.amount + addend.amount, to);
    }
}
