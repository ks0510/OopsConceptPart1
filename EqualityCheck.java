package oops;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */
public class EqualityCheck {

	/*
	 * To define method which can calculate the length of line
	 */

	public static int toFindLength(int a, int b, int c, int d) {

		/*
		 * To calculate length of line using cartessian method through formula
		 */

		double x = Math.pow((a - c), 2);
		double y = Math.pow((b - d), 2);
		int length = (int) Math.sqrt(x + y);

		return length;
	}

	public static void toCheckEquality(int a, int b) {

		/*
		 * Converting arguments into object to use equals() method
		 */
		Integer object1 = new Integer(a);
		Integer object2 = new Integer(b);

		/*
		 * To store boolean result true or false for lengths are equal or not
		 */

		boolean result = object1.equals(object2);

		if (result) {
			System.out.println("Lengths of both lines are equal");
		} else {
			System.out.println("Lenghts of both lines are different");
		}
	}

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * To take user input for coordinates to find length of line
		 * 
		 */

		System.out.println("Enter cooradinatesof line to find length");

		int x1 = sc.nextInt();

		int x2 = sc.nextInt();

		int y1 = sc.nextInt();

		int y2 = sc.nextInt();

		/*
		 * To call method toFindLength() to calculate and print the length of line
		 */

		int length1 = toFindLength(x1, y1, x2, y2);

		System.out.println("The length of line is " + length1);

		/*
		 * To take another length for comparision
		 */

		int length2 = sc.nextInt();

		/*
		 * To call check eqaul method
		 */

		toCheckEquality(length1, length2);

	}
}
