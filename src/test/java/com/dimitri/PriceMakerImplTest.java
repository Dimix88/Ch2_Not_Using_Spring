package com.dimitri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceMakerImplTest {

    @Test
    public void fullPrice() {
        PriceMaker test = new PriceMakerImpl();
        double result = test.fullPrice(10, 2.50);
        Assert.assertEquals("The quantity multiplied by the price per item",25, result, 0);
    }
}