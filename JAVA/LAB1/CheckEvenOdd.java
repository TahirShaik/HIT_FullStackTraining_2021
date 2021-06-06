/**
 * @author		: Tahir Shaik
 * @fileName	: CheckEvenOdd.java
 * @date		: 06/06/2021
 * @description : Program to a number is Even or Odd
 *
 */
class CheckEvenOdd{
	public static void main(String args[]){
		int num=20;
		//If number is divisible by 2 then it's an even number else odd number
		if ( num % 2 == 0 )
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
	}
}