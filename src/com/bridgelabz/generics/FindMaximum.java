package com.bridgelabz.generics;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaximum<E> {

	// Generic method to find maximum value for variable number of arguments
	public E findMaximum(E... values) {
		Arrays.sort(values);
		E max = values[values.length - 1];
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Welcome Message
		System.out.println("Welcome to Find Maximum Program using Generics");

		FindMaximum<Integer> integerObj = new FindMaximum<Integer>();
		FindMaximum<Double> doubleObj = new FindMaximum<Double>();
		FindMaximum<String> stringObj = new FindMaximum<String>();

		System.out.println("The maximum number among entered integers is " + integerObj.findMaximum(2, 5, 1, -8));
		System.out.println("The maximum number among entered float numbers is "
				+ doubleObj.findMaximum(6.7, 4.89, -9.87, 5.67, 10.24));
		System.out.println("The highest string is  " + stringObj.findMaximum("Apple", "Banana"));
		sc.close();
	}
}
