package oops;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class CompareLength {

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

	/*
	 * To define method which compare to lenghts of lines
	 */

	public static void toCompareLength(int a, int b) {

		/*
		 * Converting arguments into object to use compareTo() method
		 */

		Integer object1 = new Integer(a);
		Integer object2 = new Integer(b);

		/*
		 * To compare the lengths of both lines using compareTo method and save result
		 * into variable result
		 */

		int result = object1.compareTo(object2);

		if (result > 0) {
			System.out.println("Length of line 1 is greater than length of Line 2");
		} else if (result < 0) {
			System.out.println("Length of line 1  is less than length of Line 2");
		} else {
			System.out.println("Length of line 1  is equal to length of Line 2");
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
		 * To call compare method for comparision
		 */

		toCompareLength(length1, length2);

	}
}
