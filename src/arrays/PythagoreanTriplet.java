package arrays;

import java.util.Arrays;
import java.util.function.Predicate;

/*
 * Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies 
 * a^2 + b^2 = c^2.
Example:

Input: arr[] = {3, 1, 4, 6, 5}
Output: True
There is a Pythagorean triplet (3, 4, 5).
 * 
 * 
 */
public class PythagoreanTriplet {

	public static void main(String[] args) {
		int ar[] = { 3, 5, 1, 4, 6 };
		int ar_size = ar.length;
		if (isTriplet(ar, ar_size) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean isTriplet(int[] ar, int ar_size) {
		Object a[] = Arrays.stream(ar).boxed().map(e -> e * e).toArray();
		boolean foundTriplet = false;
		for (Object i : a) {
			for (Object j : a) {
				if (check(i, j, a)) {
					foundTriplet = true;
				}
				if (foundTriplet)
					break;
			}
			if (foundTriplet)
				break;

		}
		return foundTriplet;
	}

	private static boolean check(Object i, Object j, Object[] a) {
		int sum = Integer.valueOf(i.toString()) + Integer.valueOf(j.toString());

		Predicate<? super Object> predicate = x -> Integer.valueOf(x.toString()) == sum;
		return Arrays.stream(a).filter(predicate).count() > 0;

	}

}
