package com.example.multiplier;

import org.junit.Test;

import junit.framework.Assert;

public class MultiplierTest {
	 @Test
	    public void testMultiply() {
	        Assert.assertEquals(20, Multiplier.multiply(4,5));
	    }

}
