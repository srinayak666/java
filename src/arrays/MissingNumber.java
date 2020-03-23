package arrays;

/*How to find the missing number/numbers in integer array of 1 to 10 or 1 to 100?
 OR find missing number in any of the sequence of integers?

 * 
 * 
 * 


 */
public class MissingNumber {
	
	public static void main(String args[]) {
		
		int[] array= {1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,19};
		
		missingNumber(array);
	}
	
	public static void missingNumber(int[] array) {
		
		int i=0;int j=array.length;
		int nextI=i+1;
		
		while(i<j && nextI<j) {
			
			
			if(Math.abs(array[i]-array[nextI])!=1) {
				System.out.println("Missing No:"+ (array[nextI]-1));
			}
			
			i++;
			nextI=i+1;
		}
		
		

		
	}

}
