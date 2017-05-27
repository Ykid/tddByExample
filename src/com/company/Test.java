package com.company;

/**
 * Created by david on 27/5/2017.
 */
public class Test {
    public void runTest() {
        new Test().testMultiplication();
        new Test().testEquality();
        new Test().testFrancMultiplication();
        new Test().testEquality();
        new Test().testMoneyEquality();
    }
    public void testMultiplication() {
        System.out.println("----------testMultiplication----------");
        Dollar five = new Dollar(5);
        AssertHelper.assertEquals( new Dollar(10), five.times(2));
        AssertHelper.assertEquals(new Dollar(15), five.times(3));
    }

    public void testEquality() {
        System.out.println("----------testEquality----------");
        AssertHelper.assertEquals(true, new Dollar(5).equals(new Dollar(5)));
        AssertHelper.assertEquals(false, new Dollar(6).equals(new Dollar(5)));
    }

    public void testFrancMultiplication() {
        System.out.println("----------testFrancMultiplication----------");
        Franc five = new Franc(5);
        AssertHelper.assertEquals( new Franc(10), five.times(2));
        AssertHelper.assertEquals(new Franc(15), five.times(3));
    }

    public void testMoneyEquality() {
        System.out.println("----------testMoneyEquality----------");
        AssertHelper.assertEquals(true, new Dollar(5).equals(new Dollar(5)));
        AssertHelper.assertEquals(false, new Dollar(6).equals(new Dollar(5)));
        AssertHelper.assertEquals(true, new Franc(5).equals(new Franc(5)));
        AssertHelper.assertEquals(false, new Franc(6).equals(new Franc(5)));
        AssertHelper.assertEquals(false, new Dollar(5).equals(new Franc(5)));
    }
}
