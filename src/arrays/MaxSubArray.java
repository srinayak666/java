package arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Given an array of integers, find largest sub-array formed by consecutive integers. 
The sub-array should contain all distinct values.

Example:
I/P: { 2, 0, 2, 1, 4, 3, 1, 0 }

O/P: 
The largest sub-array is { 0, 2, 1, 4, 3 }
 * 
 */
public class MaxSubArray {

	public static void main(String args[]) {

		int[] inputArray = { 2, 0, 2, 1, 4, 8, 1, 0, 100, 101, 102, 103, 104, 105, 106, 107 };

		getMaxSubArray(inputArray);

	}

	private static int[] getMaxSubArray(int[] inputArray) {
		int smallSequenceNo = inputArray[0];
		int i = 0;
		int index = 0;
		Set<Integer> tempSet = null;
		List<Set<Integer>> lis = new ArrayList<>();

		while (i < inputArray.length) {

			if (inputArray[i] < smallSequenceNo) {
				smallSequenceNo = inputArray[i];

				tempSet = new LinkedHashSet<>();
				tempSet.add(smallSequenceNo);
				index = i;
				while (index != inputArray.length) {
					if (smallSequenceNo < inputArray[index] && smallSequenceNo != inputArray[index]) {

						if (tempSet.contains(inputArray[index])) {

							i = index;
							smallSequenceNo = inputArray[index];
							break;
						}
						tempSet.add(inputArray[index]);

					}
					index++;
				}
				lis.add(tempSet);

			}
			i++;

		}
		Set<Integer> greater = new LinkedHashSet<>();
		greater = lis.get(0);
		for (Set x : lis) {
			if (x.size() > greater.size()) {
				greater = x;
			}

		}
		System.out.println("The largest sub-array is" + greater.toString());

		return null;
	}

}
