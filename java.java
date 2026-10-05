package Session;

import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		// If two args provided, try to parse them as numbers and print sum
		if (args.length >= 2) {
			try {
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				System.out.println("Sum: " + (a + b));
				return;
			} catch (NumberFormatException e) {
				System.err.println("Invalid numeric arguments. Falling back to interactive input.");
			}
		}

		// Interactive input
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter first number: ");
			double a = sc.nextDouble();
			System.out.print("Enter second number: ");
			double b = sc.nextDouble();
			System.out.println("Sum: " + (a + b));
		} catch (Exception e) {
			System.err.println("Invalid input. Please enter numeric values.");
		} finally {
			sc.close();
		}
	}

}
