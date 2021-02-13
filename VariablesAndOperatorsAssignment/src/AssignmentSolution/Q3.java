package AssignmentSolution;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*
		 Question 3
		 Write a Java program that takes two numbers as input and display the product of two numbers.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter the second number : ");
		int num2 = scan.nextInt();
		
		int product = num1 * num2;
		
		System.out.println("The product of the two numbers is "+product);
		
		
	}

}
