package com.workshop.ctdd.testdoubles;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void whenPalindrom_thenAccept() {
		Palindrome palindromeTester = new Palindrome();
		assertTrue(palindromeTester.isPalindrome("noon"));
	}
	
	


}
