package Calculators;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user for the first number 
		System.out.println("Enter the first number: ");
		int num1 = scanner.nextInt();
		
		// Prompt user for the second number 
		System.out.println("Enter the second number: ");
		int num2 = scanner.nextInt();
		
		// Calculate the sum
		int sum = num1 + num2;
		
		// Display result 
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
		
		scanner.close();
	}
}
