package com.company;

/**
 * Created by david on 27/5/2017.
 */
public class AssertHelper {
    public static void assertEquals(Object obj1, Object obj2) {
        boolean result = false;
        if (obj1 == null && obj2 == null) result = true;
        if (obj1 != null) {
            result = obj1.equals(obj2);
        }
        if (result) {
            System.out.println("test passed!");
        } else {
            System.err.println("test failed");
            System.err.println("obj1 is: " + obj1 + ". obj2 is: " + obj2);
            throw new RuntimeException("test failed!");
        }
    }
}
