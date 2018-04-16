package com.workshop.ctdd.salestax;

public class SalesTax 
{
	private final float TAX =  0.1F;
	
    public float calculate( float amount )
    {
        return amount*TAX;
    }
}
