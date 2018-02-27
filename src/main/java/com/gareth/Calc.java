package com.gareth;
import java.io.*;
public class Calc {

    public static void main( String[] args )
    {
        MathsAdding add = new MathsAdding();
        MathsSubtracting sub = new MathsSubtracting();
        MathsDividing div = new MathsDividing();

        System.out.println(add.calcadd(10,5));
        System.out.println(sub.calcsub(10,5));
        System.out.println(div.calcdiv(10,5));

    }



}
