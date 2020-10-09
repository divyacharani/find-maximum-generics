package com.bridgelabz.generics;

import java.util.Scanner;

public class FindMaximum {

	// Method to find maximum value among integers
	public static Integer findMaximumInteger(Integer firstNum, Integer secondNum, Integer thirdNum) {
		Integer max = firstNum;
		if (secondNum.compareTo(max) > 0)
			max = secondNum;
		if (thirdNum.compareTo(max) > 0)
			max = thirdNum;
		return max;
	}

	// Method to find maximum value among float values
	public static Double findMaximumFloat(Double firstNum, Double secondNum, Double thirdNum) {
		Double max = firstNum;
		if (secondNum.compareTo(max) > 0)
			max = secondNum;
		if (thirdNum.compareTo(max) > 0)
			max = thirdNum;
		return max;
	}

	// Method to find highest string
	public static String findMaximumString(String firstStr, String secondStr, String thirdStr) {
		String max = firstStr;
		if (secondStr.compareTo(max) > 0)
			max = secondStr;
		if (thirdStr.compareTo(max) > 0)
			max = thirdStr;
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

		// Input for float values
		System.out.println("Enter first float number");
		double firstFloatNum = sc.nextDouble();
		System.out.println("Enter second float number");
		double secondFloatNum = sc.nextDouble();
		System.out.println("Enter third float number");
		double thirdFloatNum = sc.nextDouble();

		// Input for strings
		System.out.println("Enter first string");
		sc.nextLine();
		String firstString = sc.nextLine();
		System.out.println("Enter second string");
		String secondString = sc.nextLine();
		System.out.println("Enter third string");
		String thirdString = sc.nextLine();

		System.out.println("The maximum number among entered integers is "
				+ findMaximumInteger(firstIntNum, secondIntNum, thirdIntNum));
		System.out.println("The maximum number among entered float numbers is "
				+ findMaximumFloat(firstFloatNum, secondFloatNum, thirdFloatNum));
		System.out.println("The highest string is  " + findMaximumString(firstString, secondString, thirdString));
		sc.close();
	}
}
