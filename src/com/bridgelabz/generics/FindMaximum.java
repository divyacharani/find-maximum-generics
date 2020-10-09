package com.bridgelabz.generics;

import java.util.Scanner;

public class FindMaximum <E extends Comparable<E>>{
	
	private E first, second, third;

	//Construcor
	public FindMaximum(E first, E second, E third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	// Generic method to find maximum value
	public  E findMaximum() {
		E max = first;
		if (second.compareTo(max) > 0)
			max = second;
		if (third.compareTo(max) > 0)
			max = third;
		return max;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Welcome Message
		System.out.println("Welcome to Find Maximum Program using Generics");

		// Input for integers
		System.out.println("Enter first integer number");
		int firstIntNum = sc.nextInt();
		System.out.println("Enter second integer number");
		int secondIntNum = sc.nextInt();
		System.out.println("Enter third integer number");
		int thirdIntNum = sc.nextInt();
		FindMaximum<Integer> integerObj = new FindMaximum<Integer>(firstIntNum, secondIntNum, thirdIntNum);

		// Input for float values
		System.out.println("Enter first float number");
		double firstFloatNum = sc.nextDouble();
		System.out.println("Enter second float number");
		double secondFloatNum = sc.nextDouble();
		System.out.println("Enter third float number");
		double thirdFloatNum = sc.nextDouble();
		FindMaximum<Double> doubleObj = new FindMaximum<Double>(firstFloatNum, secondFloatNum, thirdFloatNum);

		// Input for strings
		System.out.println("Enter first string");
		sc.nextLine();
		String firstString = sc.nextLine();
		System.out.println("Enter second string");
		String secondString = sc.nextLine();
		System.out.println("Enter third string");
		String thirdString = sc.nextLine();
		FindMaximum<String> stringObj = new FindMaximum<String>(firstString, secondString, thirdString);
		
		System.out.println("The maximum number among entered integers is "
				+ integerObj.findMaximum());
		System.out.println("The maximum number among entered float numbers is "
				+ doubleObj.findMaximum());
		System.out.println("The highest string is  " + stringObj.findMaximum());
		sc.close();
	}
}
