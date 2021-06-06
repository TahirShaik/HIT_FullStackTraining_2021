/**
 * @author		: Tahir Shaik
 * @fileName	: Calculator.java
 * @date		: 06/06/2021
 * @description : Program to create a calculator
 *
 */
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		char operator;
		Double number1, number2, result;
		// create an object of Scanner class
		Scanner input = new Scanner(System.in);
		// ask users to enter operator
		System.out.print("Choose an operator: +, -, *, or / : ");
		operator = input.next().charAt(0);
		// ask users to enter numbers
		System.out.print("Enter first number: ");
		number1 = input.nextDouble();
		System.out.print("Enter second number: ");
		number2 = input.nextDouble();
		switch (operator) {
			// performs addition between numbers
			case '+':
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = "+ result);
				break;
			// performs subtraction between numbers
			case '-':
				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = "+ result);
				break;
			// performs multiplication between numbers
			case '*':
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = "+ result);
				break;
			// performs division between numbers
			case '/':
				result = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = "+ result);
				break;
			default:
				System.out.println("Invalid operator!");
				break;
		}
		input.close();
	}
}