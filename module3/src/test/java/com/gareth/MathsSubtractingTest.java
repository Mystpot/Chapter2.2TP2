package com.gareth;

import org.junit.Assert;
import org.junit.Test;


public class MathsSubtractingTest {

    @Test
    public void calcsub() {
        MathsSubtracting sub = new MathsSubtracting();
        int result = sub.calcsub(10, 5);
        Assert.assertEquals(5, result);
    }
}