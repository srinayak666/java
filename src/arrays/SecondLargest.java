package arrays;

/*
 * Write a program to return second largest number in the aarray of integers
 * 
 * if list is empty or has only 1 element return 0
 */
public class SecondLargest {

	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 2, 5, -1, -2, 9, 10, 20, 6, 3, 8 };
		int a1[] = { -1, -2, -9, -10, -20, -3, -4 };
		int a2[] = { -100, -200, -900, -10, 20, 3, -4 };
		System.out.println("Second Largest Number TEST-1 is:" + second_largest(a));
		System.out.println("Second Largest Number TEST-2 is:" + second_largest(a1));

		System.out.println("Second Largest Number TEST-3 is:" + second_largest(a2));
	}

	public static int second_largest(int[] arr) {
		int largest = arr[0];
		int second_largest = arr[1];
		int i = 0, j = arr.length - 1;
		if (arr == null || arr.length < 2) {
			second_largest = 0;
		}
		while (i < j) {

			if (arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];
			} else if (arr[i] > second_largest && arr[i] < largest) {
				second_largest = arr[i];
			}

			i++;

		}

		return second_largest;
	}
}
