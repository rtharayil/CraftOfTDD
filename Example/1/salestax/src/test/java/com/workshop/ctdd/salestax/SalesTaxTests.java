package com.workshop.ctdd.salestax;

import org.junit.Test;

import junit.framework.Assert;

public class SalesTaxTests 
    
{
	@Test
	public void SalesTaxTest() {
		
		SalesTax salesTax = new SalesTax();
		
		float tax =salesTax.calculate(10.00F);
		
		Assert.assertEquals(1.0, tax, 0.01);
	}
    
}
