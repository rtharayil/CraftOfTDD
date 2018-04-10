package com.workshop.ctdd.fixtures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {
	
		
	@BeforeClass
	public static void setupTestCaseS() {
		 System.out.println("test1.setupTestCaseS - @BeforeClass");
	}
	
	@AfterClass
	public static void cleanupTestCaseS() {
		 System.out.println("test1.cleanupTestCaseS - @AfterClass");
	}
	@Test
    public void check1() {
        System.out.println("test1.check1");
    }
	@Test
    public void check2() {
        System.out.println("test1.check2");
    }



}
