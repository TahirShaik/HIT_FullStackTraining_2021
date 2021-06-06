/**
 * @author		: Tahir Shaik
 * @fileName	: AreaOfCircle.java
 * @date		: 06/06/2021
 * @description : Program to Find the area of a Circle
 *
 */
import java.util.Scanner;
public class AreaOfCircle {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter the radius: ");
		/*
		 * We are storing the entered radius in double
		 * because a user can enter radius in decimals
		 * 
		 */
		double radius = sc.nextDouble();
		//Area = PI*radius*radius (PI = 3.1414)
		double area = Math.PI * (radius * radius);
		System.out.println("The area of circle is: " + area);
		//Circumference = 2*PI*radius
		double circumference= Math.PI * 2*radius;
		System.out.println( "The circumference of the circle is: "+circumference) ;
	}
}