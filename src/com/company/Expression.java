package com.company;

/**
 * Created by david on 5/6/2017.
 */
public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
}
