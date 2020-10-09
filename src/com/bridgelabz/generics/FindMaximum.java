package com.bridgelabz.generics;

import java.util.Scanner;

public class FindMaximum {

	// Method to find maximum value
	public static Integer findMaximum(Integer firstNum, Integer secondNum, Integer thirdNum) {
		Integer max = firstNum;
		if (secondNum.compareTo(max) > 0)
			max = secondNum;
		if (thirdNum.compareTo(max) > 0)
			max = thirdNum;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Welcome Message
		System.out.println("Welcome to Find Maximum Program using Generics");
		System.out.println("Enter first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number");
		int secondNum = sc.nextInt();
		System.out.println("Enter third number");
		int thirdNum = sc.nextInt();
		System.out.println("The maximum number is " + findMaximum(firstNum, secondNum, thirdNum));
		sc.close();
	}
}
