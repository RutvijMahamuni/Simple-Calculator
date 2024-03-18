package basicCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import basicCalculator.NotANumberException;

class Operations {
	public int addition(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		int c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return c;
	}
}

public class BasicCalculator {
	public static void main(String[] args) throws IOException, NotANumberException {
		Operations o = new Operations();
		int a, b, sel;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		while (flag) {
			System.out.println();
			System.out.println("*****Calculator********");
			System.out.println("Select your operation: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("0. Exit");
			System.out.println("***********************");
			try {
				sel = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				throw new NotANumberException();
			}
			switch (sel) {
			case 1:
				System.out.println("Enter first number: ");
				try {
					a = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					throw new NotANumberException();
				}
				System.out.println("Enter second number: ");
				try {
					b = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					throw new NotANumberException();
				}
				System.out.println("Addition is: " + o.addition(a, b));
				break;
			case 2:
				System.out.println("Enter first number: ");
				try {
					a = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					throw new NotANumberException();
				}
				System.out.println("Enter second number: ");
				try {
					b = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					throw new NotANumberException();
				}
				System.out.println("Subtraction is: " + o.subtraction(a, b));
				break;
			case 3:
				System.out.println("Enter first number: ");
				try {
					a = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					throw new NotANumberException();
				}
				System.out.println("Enter second number: ");
				try {
					b = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					throw new NotANumberException();
				}
				System.out.println("Multiplication is: " + o.multiplication(a, b));
				break;
			case 4:
				System.out.println("Enter numerator number: ");
				try {
					a = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					throw new NotANumberException();
				}
				System.out.println("Enter denominator number: ");
				try {
					b = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					throw new NotANumberException();
				}
				System.out.println("The quotient is: " + o.division(a, b) + " and the remainder is: " + (a % b));
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Invalid selection!!");

			}
		}

	}
}