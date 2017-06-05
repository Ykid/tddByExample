package com.company;

/**
 * Created by david on 5/6/2017.
 */
public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
