/*
 * This is program is created to take coordinates of point and calculate length of 
 * line using cartessian method
 */

package oops;

import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class FindLength {
	
	/*
	 * To define method which can calculate the length of line 
	 */

	public static int toFindLength(int a,int b,int c,int d) {
		
		/*
		 * To calculate length of line using cartessian method through formula
		 */
		
		double x = Math.pow((a - c), 2);
		double y = Math.pow((b - d), 2);
		int length = (int) Math.sqrt(x + y);

		return length;
	}
	
	/**
	 * This is main method of program and starting point of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		/*
		 * To take user input for coordinates to find length of line
		 * 
		 */
		
		System.out.println("Enter cooradinatesof line to find length");
		
		int x1= sc.nextInt();
		
		int x2=sc.nextInt();
		
		int y1=sc.nextInt();
		
		int y2=sc.nextInt();
		
		/*
		 *To call method toFindLength() to calculate and print the length of line
		 */
		
		System.out.println("The length of line is "+toFindLength(x1,y1,x2,y2));
     }
}
