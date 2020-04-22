package final_keyword;

public class FinalVariable {
	
	public static void main(String args[]) {
		EvenCheck(8);
		
	}
	public static boolean EvenCheck(int number) {
		final boolean isTrue; //final variable not assigned
		
		if(number%2==0) { //If final variable isTrue not assigned in else block compiler will complain (Initialize variable) - compile time error  
			isTrue=true;
		}else {
			isTrue=false; //This is valid
		}
		
		/*
		 * Note: this property is same for Non-final variable , even those need to be assigned
		 */
		return isTrue;
	}

}
