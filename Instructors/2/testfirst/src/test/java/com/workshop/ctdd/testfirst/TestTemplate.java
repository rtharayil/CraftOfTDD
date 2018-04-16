package com.workshop.ctdd.testfirst;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;



public class TestTemplate 

{	
	Template template;
	
	@Before
	public void setup() {
		template = KnowsDomain.getTempate();
	}
	
	
	@Test
	public void TestSingleVariableTemplate() {		
		
		template.set("name","Reader");
		String output = template.evaluate("Hello, ${name}");
		Assert.assertEquals("Hello, Reader", output);
	}



	@Test 
	public void TestMultipleVaraiblesTemaplates() {
		
		template.set("greeting" ,"Hi");
		template.set("name", "Reader");
		String output = template.evaluate("${greeting}, ${name}");
		Assert.assertEquals("Hi, Reader",output );

	}

	@Test(expected = IllegalStateException.class)
	public void TestVariableValueMissing() {

		template.evaluate("Hello, ${name}");

	}
	@Test
	public void TestVariableNotUsed() {			
		
		String output = template .evaluate("Hello, ${name}");
		Assert.assertEquals("Hello, Reader", output );
	}

}
