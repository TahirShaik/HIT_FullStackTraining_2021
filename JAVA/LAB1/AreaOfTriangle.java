/**
 * @author		: Tahir Shaik
 * @fileName	: AreaOfTriangle.java
 * @date		: 06/06/2021
 * @description : Program to Find the area of a Triangle
 *
 */
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the width of the Triangle: ");
		double base = scanner.nextDouble();
		System.out.print("Enter the height of the Triangle: ");
		double height = scanner.nextDouble();
		//Area = (base*height)/2
		double area = (base* height)/2;
		System.out.println("Area of Triangle is: " + area);
	}
}