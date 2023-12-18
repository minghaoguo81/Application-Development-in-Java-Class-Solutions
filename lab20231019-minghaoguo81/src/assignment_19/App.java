package assignment_19;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	
	Given a string that contains a single pair of brackets, compute recursively a new string made of 
	only of the brackets and their contents, so "xyz[abc]123" yields "[abc]".

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		insideBrackets("xyz[abc]123") <b>---></b> [abc]<br>
		insideBrackets("x[hello]") <b>---></b> [hello] <br>
		insideBrackets("[xy]1") <b>---></b> [xy] <br>
	 */
	
	public static String insideBrackets(String str) {
	
		// complete the body of this method
		int openBracketIndex = str.indexOf("[");
		int closeBracketIndex = str.indexOf("]");
	
		// If there are no brackets or the close bracket appears before the open bracket, return an empty string
		if (openBracketIndex == -1 || closeBracketIndex == -1 || closeBracketIndex < openBracketIndex) {
			return "";
		}
	
		// Extract the text between the brackets
		String textInsideBrackets = str.substring(openBracketIndex, closeBracketIndex + 1);

		return textInsideBrackets;
	}	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

