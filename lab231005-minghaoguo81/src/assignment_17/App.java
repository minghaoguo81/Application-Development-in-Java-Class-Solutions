package assignment_17;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	
	Given a string, compute recursively a new string where all the 
		lowercase 'o' chars have been moved to the end of the string.

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		endoo("oore") <b>---></b> reoo<br>
		endoo("oohoi") <b>---></b> hiooo <br>
		endoo("oanotgo") <b>---></b> antgooo <br>
	 */
	
	public static String endoo(String str) {
		
		// complete the body of this method
		
		if (str.length() <= 1) {
			return str;
		}
	
		// Check if the first character is 'o'
		if (str.charAt(0) == 'o') {
			// Move 'o' to the end of the string
			return endoo(str.substring(1)) + 'o';
		} else {
			// Keep the first character and recursively process the rest of the string
			return str.charAt(0) + endoo(str.substring(1));
		}

		//return str;
		
		
	}



	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

