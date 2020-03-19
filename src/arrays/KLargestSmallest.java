package arrays;

/*
 * 
 * Question: Write an efficient program for printing k largest and smallest elements in an array.
 *  Elements in array can be in any order.
For example, if given array is [1, 23, 12, 9, 30, 2, 50] and you are asked for the largest 3 elements
 i.e., k = 3 then your program should print 50, 30 and 23.
 */
public class KLargestSmallest {

	public static void kLargest(Integer[] arr, int k) {
		int largest = arr[0];
		int i = 0;
		int j = arr.length - 1;
		int index = 0;
		int count = 0;
		while (i < j) {
			if (arr[i] > largest) {
				largest = arr[i];
				index = i;

			}
			if (arr[j] > largest) {
				largest = arr[j];
				index = j;

			}
			i++;
			j--;
			if (i == j) {
				if (arr[i] > largest) {
					largest = arr[j];
					index = j;
				}
			}
			if (count < k && i == j) {

				System.out.println(" Kth Largest Element:---" + largest + "With Index:---" + index);
				arr[index] = 0;
				i = 0;
				j = arr.length - 1;
				largest = arr[i];
				count++;

			}

		}

	}

	public static void kSmallest(Integer[] arr, int k) {
		int smallest = arr[0];
		int i = 0;
		int j = arr.length - 1;
		int index = 0;
		int count = 0;
		while (i < j) {
			if (arr[i] < smallest) {
				smallest = arr[i];
				index = i;

			}
			if (arr[j] < smallest) {
				smallest = arr[j];
				index = j;

			}
			i++;
			j--;
			if (i == j) {
				if (arr[i] < smallest) {
					smallest = arr[j];
					index = j;
				}
			}
			if (count < k && i == j) {

				System.out.println(" Kth Smallest Element:---" + smallest + "--" + "With Index:---" + index);
				arr[index] = Integer.MAX_VALUE;
				i = 0;
				j = arr.length - 1;
				smallest = arr[i];
				count++;

			}

		}

	}

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 1, 230, 12, 900, 30, 2, 50 };
		Integer small_arr[] = new Integer[] { 1, 230, 12, 9, 30, 2, 50 };
		int k = 3;
		kLargest(arr, k);
		kSmallest(small_arr, k);
	}
}
