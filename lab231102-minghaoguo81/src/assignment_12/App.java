package assignment_12;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Return a version of the given string, where for every star (*) 
	in the string the star and the chars immediately to its left and right are gone. 
	So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		starKill("cd*zq")  <b>---></b>"cq"<br>
		starKill("ab**cd")    <b>---></b> "ad" <br>
		starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */
	
	 public static String starKill(String str) {
        StringBuilder result = new StringBuilder();
		int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == '*') {
                // Skip the star and the chars immediately to its left and right
				i++;
			} else if ((i + 1) <= str.length() - 1 && str.charAt(i + 1) == '*') {
				i++;
			} else if ((i - 1) >= 0 && str.charAt(i - 1) == '*') {
				i++;
			} else {
				result.append(str.charAt(i));
				i++;
			}
		}
        return result.toString();
    }
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
