package com.bridgelabz.generics;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaximum<E> {

	// Generic method to find maximum value for variable number of arguments
	public void findMaximum(E... values) {
		Arrays.sort(values);
		E max = values[values.length - 1];
		printMax(max);
	}
	
	//Method to print maximum value
	public void printMax(E maxValue) {
		System.out.println("The maximum value is "+maxValue);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Welcome Message
		System.out.println("Welcome to Find Maximum Program using Generics");

		FindMaximum<Integer> integerObj = new FindMaximum<Integer>();
		FindMaximum<Double> doubleObj = new FindMaximum<Double>();
		FindMaximum<String> stringObj = new FindMaximum<String>();
		
		//Finding maximum value
		integerObj.findMaximum(2, 5, 1, -8);
		doubleObj.findMaximum(6.7, 4.89, -9.87, 5.67, 10.24);
		stringObj.findMaximum("Apple", "Banana");
		sc.close();
	}
}
