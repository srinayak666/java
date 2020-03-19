package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 *PROBLEM:
 * Given an unsorted array of integers, find a pair with given sum in it.

Input:

arr = [8, 7, 2, 5, 3, 1]
sum = 10
Output:

Pair found at index 0 and 2 (8 + 2)
or
Pair found at index 1 and 4 (7 + 3)
 * 
 */

public class FindPair {

	/*
	 * 
	 * finding pair with Java 8 streams
	 * 
	 */

	public static void findPair(int[] _array, int sum) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Arrays.stream(_array).map(e -> sum - e).forEach(e -> {
			if (map.containsKey(sum - e))
				System.out.println("(" + e + ", " + (sum - e) + ")");
			else
				map.put(e, e);
		});

	}

	// Find pair with given sum in the array main method
	public static void main(String[] args) {
		int[] A = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		findPair(A, sum);
	}
}
