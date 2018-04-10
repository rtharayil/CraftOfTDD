package com.workshop.ctdd.testdoubles;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for TestSomeComplexComputation.
 */
public class TestSomeComplexComputation
    
{
    @Test
    public void testComputeWithOddSeed()    
    {
    	SomeComplexComputation Computation = new SomeComplexComputation(new Algorithm());
    	
    	Assert.assertEquals(1, Computation.compute(1));
       
    }
	
    
    @Test
    public void testComputeWithEvenSeed() {
    	
    	SomeComplexComputation Computation = new SomeComplexComputation(new Algorithm());
    	
    	Assert.assertEquals(1, Computation.compute(2));
    	
    }
}
