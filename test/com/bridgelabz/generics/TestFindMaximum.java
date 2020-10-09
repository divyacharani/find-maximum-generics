package com.bridgelabz.generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindMaximum {

	@Test
	public void testMaxIntFirstPosition() {
		Integer expected = 10;
		assertEquals(expected, new FindMaximum().findMaximum(10, 1, -4)); // Integer at first position
	}

	@Test
	public void testMaxIntSecondPosition() {
		Integer expected = 10;
		assertEquals(expected, new FindMaximum().findMaximum(1, 10, -4)); // Integer at second position
	}

	@Test
	public void testMaxIntThirdPosition() {
		Integer expected = 10;
		assertEquals(expected, new FindMaximum().findMaximum(-4, 1, 10)); // Integer at third position
	}

	@Test
	public void testMaxFloatFirstPosition() {
		Double expected = 9.78;
		assertEquals(expected, new FindMaximum().findMaximum(9.78, -5.6, 2.35, 8.77)); // Float at first position
	}

	@Test
	public void testMaxFloatSecondPosition() {
		Double expected = 9.78;
		assertEquals(expected, new FindMaximum().findMaximum(-5.6, 9.78, 2.35, 8.77)); // Float at second position
	}

	@Test
	public void testMaxFloatThirdPosition() {
		Double expected = 9.78;
		assertEquals(expected, new FindMaximum().findMaximum(-5.6, 2.35, 9.78, 8.77)); // Float at third position
	}

	@Test
	public void testMaxStirngFirstPosition() {
		String expected = "Peach";
		assertEquals(expected, new FindMaximum().findMaximum("Peach", "Apple", "Banana")); // String at first position
	}

	@Test
	public void testMaxStirngSecondPosition() {
		String expected = "Peach";
		assertEquals(expected, new FindMaximum().findMaximum("Apple", "Peach", "Banana")); // String at second position
	}

	@Test
	public void testMaxStirngThirdPosition() {
		String expected = "Peach";
		assertEquals(expected, new FindMaximum().findMaximum("Apple", "Banana", "Peach")); // String at third position
	}
}
