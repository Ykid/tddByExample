package com.company;

import java.util.Hashtable;

/**
 * Created by david on 5/6/2017.
 */
public class Bank {
    private Hashtable rates = new Hashtable();
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));//auto boxing can help here
    }

    int rate (String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
}
