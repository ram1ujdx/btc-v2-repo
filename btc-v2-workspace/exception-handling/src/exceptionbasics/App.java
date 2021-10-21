package exceptionbasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
			System.out.println("Enter a number : ");
			int a = scan.nextInt();
			for (int i = 0; i <= 5; i++) {

				System.out.println("Trying to divide..");
				int x = a / i;
				System.out.println("Division Result = " + x);
			}
		
		System.out.println("This is an Exception Handling Excercise using Java");

		System.out.println("Program executed..");

	}

}
