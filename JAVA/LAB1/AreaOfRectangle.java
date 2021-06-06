/**
 * @author		: Tahir Shaik
 * @fileName	: AreaOfRectangle.java
 * @date		: 06/06/2021
 * @description : Program to Find the area of a rectangle
 *
 */
import java.util.Scanner;
class AreaOfRectangle {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of Rectangle: ");
		double length = scanner.nextDouble();
		System.out.print("Enter the width of Rectangle: ");
		double width = scanner.nextDouble();
		double area = length*width;
		System.out.println("Area of Rectangle is: "+area);
	}
}