package arrays;

import java.util.Arrays;

public class PrintArray {
	
	public static void main(String args[]) {
		/* print the Array using Normal for loop*/
		
		int array[]=new int[10]; /*Declare Array with Size 10*/
		
		/*add elements to Array*/
		
		for(int i=0;i<10;i++) { /* 10 elements are added starting from '0' to '9' */
		array[i]=i;	
		}
		
		System.out.println(Arrays.toString(array)); 
		/*java.util.Arrays is utility class that helps in accessing and processing arrays. It has static methods(utility)  */
		/*Out Put: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] */
		
	}

}
