package com.bridgelabz.generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindMaximum {

	@Test
	public void testMaxIntFirstPosition() {
		Integer expected = 10;
		assertEquals(expected, FindMaximum.findMaximumInteger(10, 1, -4)); // Integer at first position
	}

	@Test
	public void testMaxIntSecondPosition() {
		Integer expected = 10;
		assertEquals(expected, FindMaximum.findMaximumInteger(1, 10, -4)); // Integer at second position
	}

	@Test
	public void testMaxIntThirdPosition() {
		Integer expected = 10;
		assertEquals(expected, FindMaximum.findMaximumInteger(-4, 1, 10)); // Integer at third position
	}

	@Test
	public void testMaxFloatFirstPosition() {
		Double expected = 9.78;
		assertEquals(expected, FindMaximum.findMaximumFloat(9.78, -5.6, 2.35)); // Float at first position
	}

	@Test
	public void testMaxFloatSecondPosition() {
		Double expected = 9.78;
		assertEquals(expected, FindMaximum.findMaximumFloat(-5.6, 9.78, 2.35)); // Float at first position
	}

	@Test
	public void testMaxFloatThirdPosition() {
		Double expected = 9.78;
		assertEquals(expected, FindMaximum.findMaximumFloat(-5.6, 2.35, 9.78)); // Float at first position
	}
}
