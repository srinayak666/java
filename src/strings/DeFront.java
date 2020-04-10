package strings;

/*
 * 
Given a string, return a version without the first 2 chars. 
Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"

other test strings:  O/p: deFront("java") → "va"
other test strings:  O/p:deFront("aaa") → "aa"	
other test strings:  O/p:deFront("bbb") → "bb"			
other test strings:  O/p:deFront("bazz") → "zz"		
other test strings:   O/p:deFront("ba") → ""	
 * 
 * 
 */

public class DeFront {

	public static void main(String args[]) {

		System.out.println(DeFront.deFront("away"));
	}

	public static String deFront(String str) {

		return (str.substring(0, 2).equalsIgnoreCase("ab") ? "ab" : " ").length() == 2 ? str.trim()
				: getChar(str).trim() + str.substring(2, str.length()).trim();

	}

	private static String getChar(String str) {
		return (str != null && str.charAt(0) == 'a') ? "a" : (str.charAt(1) == 'b' ? "b" : " ");
	}
}
