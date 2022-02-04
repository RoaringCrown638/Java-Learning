package CMT219_Exercise_Set_1_Code;

import java.util.Scanner;

public class RewriteNumber {
	public static void main( String args[] ) {
	    try (Scanner in = new Scanner( System.in )) {
			System.out.println( "Enter an integer between 0 and 9" );
			int num = in.nextInt();
			
			System.out.println( "You entered " + num );
		}
	}
}
