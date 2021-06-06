/**
 * @author		: Tahir Shaik
 * @fileName	: PowerOfNumber.java
 * @date		: 06/06/2021
 * @description : Program to Find Power of a number using while Loop
 *
 */
public class PowerOfNumber {
		public static void main(String[] args) {
			int base = 3, exponent = 4;
			System.out.print(base+" power "+exponent);
			long result = 1;
			while (exponent != 0) {
				result *= base;
				--exponent;
			}
			System.out.println(" = " + result);
		}
}