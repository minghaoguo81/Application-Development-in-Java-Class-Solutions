package assignment_18;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	
	Given a string, compute recursively a new string where identical chars 
	that are adjacent in the original string are separated from each other by a "-".

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		repeatHyphen("hello") <b>---></b> hel-lo<br>
		repeatHyphen("xxyy") <b>---></b> x-xy-y <br>
		repeatHyphen("aaaa") <b>---></b> a-a-a-a <br>
	 */
	
	public static String hyphenSplit(String str) {
	    // Check if the string is empty or has only one character, then return str
		if (str == null || str.length() <= 1) {
			return str;
		}
	
		// Check if the first character is the same as the second character
		if (str.charAt(0) == str.charAt(1)) {
			// If they are the same, add the current character and a hyphen to the result
			// and recursively process the rest of the string
			return str.charAt(0) + "-" + hyphenSplit(str.substring(1));
		} else {
			// If they are different, add the current character to the result
			// and recursively process the rest of the string
			return str.charAt(0) + hyphenSplit(str.substring(1));
		}

		//return str;
	}



	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

