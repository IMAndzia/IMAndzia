package Calculators;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.println("Welcome to the Java Quiz!");
		System.out.println("Answer the following questions by typing: a, b, c, or d. \n");
		
		// Question 1
		
		System.out.println("1. What is the correct way to declare a variable in Java?");
		System.out.println("a) int x =10; ");
		System.out.println("b) x = 10;");
		System.out.println("c) variable x = 10;");
		System.out.println("d) int x; ");
		System.out.println(" Your answer: ");
		String answer1 = scanner.nextLine();
		
		if (answer1.equalsIgnoreCase("a")) {
			score ++;
			
		}
		// Question 2
		System.out.println("1. Which keyword is used to create a class in Java?");
		System.out.println("a) function ");
		System.out.println("b) define");
		System.out.println("c) class");
		System.out.println("d) struct ");
		System.out.println("Your answer:  ");
		
		String answer2 = scanner.nextLine();
		
		if (answer2.equalsIgnoreCase("a")) {
			score ++;

		}
		
		// Question 3
		System.out.println("1. What is the output of: System.out.println(2 + 3 * 4)?");
		System.out.println("a) 14 ");
		System.out.println("b) 10");
		System.out.println("c) 20");
		System.out.println("d) 45 ");
		System.out.println(" Your answer: ");
		String answer3 = scanner.nextLine();
		
		if (answer3.equalsIgnoreCase("a")) {
			score ++;
			
		}
		
		// Display final score
		System.out.println("\n Quiz Completed! Your final score is: " + score + "/3");
		
		if (score == 3) {
			System.out.println("Excellent! You got all the questions correct.");
			
		} else if (score == 2) {
			System.out.println("Good job! You got 2 correct.");
		
		}else {
			System.out.println("Better luck next time!");
		}
		
		scanner.close();
	}
}
