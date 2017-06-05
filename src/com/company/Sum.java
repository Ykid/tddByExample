package com.company;

/**
 * Created by david on 5/6/2017.
 */
public class Sum implements Expression {
    Expression augend;
    Expression addend;
    Sum(Expression augend, Expression addend) {
        this.addend = addend;
        this.augend = augend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }
}
