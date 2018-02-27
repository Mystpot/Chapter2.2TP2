package com.gareth;

import org.junit.*;

import static org.junit.Assert.*;

public class MathsAddingTest {

    @Test
    public void calcadd() {
        MathsAdding add = new MathsAdding();
        int result = add.calcadd(10, 5);
        Assert.assertEquals(15, result);

    }
}