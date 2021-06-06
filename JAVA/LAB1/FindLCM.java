/**
 * @author		: Tahir Shaik
 * @fileName	: FindLCM.java
 * @date		: 06/06/2021
 * @description : Program to Find LCM of Two Numbers
 *
 */
public class FindLCM {
	public static void main(String[] args) {
		int n1 = 72, n2 = 120, lcm;
		// maximum number between n1 and n2 is stored in lcm
		lcm = (n1 > n2) ? n1 : n2;
		// Always true
		while(true) {
			if( lcm % n1 == 0 && lcm % n2 == 0 ) {
				System.out.println("The LCM of "+n1+" and "+n2+" is "+lcm);
				break;
			}
			++lcm;
		}
	}
}