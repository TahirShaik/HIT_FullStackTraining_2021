/**
 * @author		: Tahir Shaik
 * @fileName	: QuotientReminder.java
 * @date		: 06/06/2021
 * @description : Program to Quotient & Reminder two numbers
 *
 */
public class QuotientReminder {
	public static void main(String[] args) {
		int number1 = 150, number2 = 20;
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
	}
}