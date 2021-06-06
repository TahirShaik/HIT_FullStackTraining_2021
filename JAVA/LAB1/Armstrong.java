/**
 * @author		: Tahir Shaik
 * @fileName	: Armstrong.java
 * @date		: 06/06/2021
 * @description : Program to Find the given number is Armstrong or not
 *
 * @Armstrong Number:  	The sum of the power(Number of digits) of the digits is same as the given number.
 * 			Ex: Number: 123456 
 * 				count : 6
 * 				Result: (1^6)+(2^6)+(3^6)+(4^6)+(5^6)+(6^6)
 * 				Armstrong number = (Number == Result)	
 */
public class Armstrong {
	public static void main(String[] args) {
		int number = 371, originalNumber, remainder, result = 0;
		originalNumber = number;
		while (originalNumber != 0){
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		if(result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}
}
