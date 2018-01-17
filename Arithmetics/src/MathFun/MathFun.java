package MathFun;

import java.util.Scanner;

public class MathFun {

	static int[] numbers = { 2, 3, 5, 3, 1, 8 };
	static int i = 0;
	static int resultAdd = 0;
	static int resultSubtract = 0;
	static int resultMultiply = 1;
	static float resultDivide = 1;
	static int userChoice = 0;

	public static void main(String[] args) {

		Scanner selection = new Scanner(System.in);
		System.out.println("Please enter 1 to ADD, 2 to SUBTRACT, 3 to MULTIPLY, or 4 to DIVIDE: ");
		int choice = selection.nextInt();
		
		if (choice == 1) {
			numberAdd(numbers);
		}
		else if (choice == 2) {
			numberSubtract(numbers); 
		}
		else if (choice == 3) {
			numberMultiply(numbers); 
		}
		else if (choice == 4) {
			numberDivide(numbers);
		}
		
		else {
			System.out.println("Sorry, your choice did not match a valid option.");
		}
		
		selection.close();
		 

	}
	

	public static void numberAdd(int[] array) {
		for (i = 0; i < array.length; i++) {
			resultAdd = resultAdd + array[i];
		}

		System.out.println("The total sum of integers in the array is: " + resultAdd);

	}

	public static void numberSubtract(int[] array) {
		for (i = 0; i < array.length; i++) {
			resultSubtract = resultSubtract - array[i];
		}

		System.out.println("The total difference of integers in the array is: " + resultSubtract);

	}

	public static void numberMultiply(int[] array) {

		for (i = 0; i < array.length; i++) {
			resultMultiply = resultMultiply * array[i];
		}

		System.out.println("The total product of integers in the array is: " + resultMultiply);

	}

	public static void numberDivide(int[] array) {
		for (i = 0; i < array.length; i++) {
			resultDivide = resultDivide / array[i];
		}

		System.out.println("The total dividend of integers in the array is: " + resultDivide);

	}

}
