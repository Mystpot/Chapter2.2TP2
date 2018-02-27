package com.gareth;

import org.junit.Assert;
import org.junit.Test;


public class MathsDividingTest {

    @Test
    public void calcdiv() {
        MathsDividing div = new MathsDividing();
        int result = div.calcdiv(10, 5);
        Assert.assertEquals(2, result);
    }
}