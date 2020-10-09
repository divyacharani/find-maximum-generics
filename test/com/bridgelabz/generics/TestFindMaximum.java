package com.bridgelabz.generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindMaximum {

	@Test
	public void testMaxIntFirstPosition() {
		Integer expected = 10;
		assertEquals(expected, FindMaximum.findMaximum(10, 1, 4));	//Integer at first position
	}
	
	@Test
	public void testMaxIntSecondPosition() {
		Integer expected = 10;
		assertEquals(expected, FindMaximum.findMaximum(1, 10, 4));	//Integer at second position
	}
	
	@Test
	public void testMaxIntThirdPosition() {
		Integer expected = 10;
		assertEquals(expected, FindMaximum.findMaximum(4, 1, 10));	//Integer at third position
	}

}
