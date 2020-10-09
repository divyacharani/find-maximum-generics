package com.bridgelabz.generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindMaximum {

	@Test
	public void testMaxIntFirstPosition() {
		Integer expected = 10;
		assertEquals(expected, new FindMaximum(10, 1, -4).findMaximum()); // Integer at first position
	}

	@Test
	public void testMaxIntSecondPosition() {
		Integer expected = 10;
		assertEquals(expected, new FindMaximum(1, 10, -4).findMaximum()); // Integer at second position
	}

	@Test
	public void testMaxIntThirdPosition() {
		Integer expected = 10;
		assertEquals(expected, new FindMaximum(-4, 1, 10).findMaximum()); // Integer at third position
	}

	@Test
	public void testMaxFloatFirstPosition() {
		Double expected = 9.78;
		assertEquals(expected, new FindMaximum(9.78, -5.6, 2.35).findMaximum()); // Float at first position
	}

	@Test
	public void testMaxFloatSecondPosition() {
		Double expected = 9.78;
		assertEquals(expected, new FindMaximum(-5.6, 9.78, 2.35).findMaximum()); // Float at second position
	}

	@Test
	public void testMaxFloatThirdPosition() {
		Double expected = 9.78;
		assertEquals(expected, new FindMaximum(-5.6, 2.35, 9.78).findMaximum()); // Float at third position
	}

	@Test
	public void testMaxStirngFirstPosition() {
		String expected = "Peach";
		assertEquals(expected, new FindMaximum("Peach", "Apple", "Banana").findMaximum()); // String at first position
	}
	
	@Test
	public void testMaxStirngSecondPosition() {
		String expected = "Peach";
		assertEquals(expected, new FindMaximum("Apple", "Peach", "Banana").findMaximum()); // String at second position
	}
	
	@Test
	public void testMaxStirngThirdPosition() {
		String expected = "Peach";
		assertEquals(expected, new FindMaximum("Apple", "Banana", "Peach").findMaximum()); // String at third position
	}
}
