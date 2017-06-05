package com.company;

/**
 * Created by david on 27/5/2017.
 */
public class Test {
    public void runTest() {
        new Test().testMultiplication();
        new Test().testEquality();
        new Test().testEquality();
        new Test().testMoneyEquality();
        new Test().testCurrency();
        new Test().testSimpleAddition();
        new Test().testPlusReturnSum();
        new Test().testReduceSum();
        new Test().testReduceMoney();
    }
    public void testMultiplication() {
        System.out.println("----------testMultiplication----------");
        Money five = Money.dollar(5);
        AssertHelper.assertEquals( Money.dollar(10), five.times(2));
        AssertHelper.assertEquals(Money.dollar(15), five.times(3));
    }

    public void testEquality() {
        System.out.println("----------testEquality----------");
        AssertHelper.assertEquals(true, Money.dollar(5).equals(Money.dollar(5)));
        AssertHelper.assertEquals(false, Money.dollar(6).equals(Money.dollar(5)));
    }

    public void testMoneyEquality() {
        System.out.println("----------testMoneyEquality----------");
        AssertHelper.assertEquals(true, Money.dollar(5).equals(Money.dollar(5)));
        AssertHelper.assertEquals(false, Money.dollar(6).equals(Money.dollar(5)));
        AssertHelper.assertEquals(false, Money.dollar(5).equals(Money.franc(5)));
    }

    public void testCurrency() {
        System.out.println("----------testCurrency----------");
        AssertHelper.assertEquals("USD", Money.dollar(5).currency());
        AssertHelper.assertEquals("CHF", Money.franc(5).currency());
    }

    public void testSimpleAddition() {
        System.out.println("----------testSimpleAddition----------");
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        AssertHelper.assertEquals(reduced, Money.dollar(10));
    }

    public void testPlusReturnSum() {
        System.out.println("----------testPlusReturnSum----------");
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        AssertHelper.assertEquals(five, sum.augend);
        AssertHelper.assertEquals(five, sum.addend);
    }

    public void testReduceSum() {
        System.out.println("----------testReduceSum----------");
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");//very readable !
        AssertHelper.assertEquals(result, Money.dollar(7));
    }

    public void testReduceMoney() {
        System.out.println("----------testReduceMoney----------");
        Bank bank = new Bank();
        Money result =  bank.reduce(Money.dollar(1), "USD");
        AssertHelper.assertEquals(result, Money.dollar(1));
    }
}
