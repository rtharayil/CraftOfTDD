package com.workshop.ctdd.fixtures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test2 {
	
	@Before
	public void setupTestCase() {
		 System.out.println("test2.setupTestCase - @Before");
	}
	
	@After
	public void cleanupTestCase() {
		 System.out.println("test2.cleanupTestCase - @After");
	}
	
	@Test
    public void check1() {
        System.out.println("test2.check1");
    }
	@Test
    public void check2() {
        System.out.println("test2.check2");
    }

}
