/**
 * @author		: Tahir Shaik
 * @fileName	: AreaOfSquare.java
 * @date		: 06/06/2021
 * @description : Program to Find the area of a square
 *
 */
import java.util.Scanner;
class AreaOfSquare {
	public static void main (String[] args) {
		System.out.print("Enter Side of Square: ");
		//Capture the user's input
		Scanner scanner = new Scanner(System.in);
		//Storing the captured value in a variable
		double side = scanner.nextDouble();
		//Area of Square = side*side
		double area = side*side;
		System.out.println("Area of Square is: "+area);
	}
}