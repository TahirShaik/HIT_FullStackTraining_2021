/**
 * @author		: Tahir Shaik
 * @fileName	: SwapNumbers.java
 * @date		: 06/06/2021
 * @description : Program to Swap two numbers without using temporary variable
 *
 */
public class SwapNumbers {
	public static void main(String[] args) {
		int first = 120, second = 220;
		System.out.println("-----Before swap-----");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		first = first - second;
		second = first + second;
		first = second - first;
		System.out.println("-----After swap-----");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}
}