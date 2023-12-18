package assignment_15;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	 public static int longestStreak(String str) {
		// Check if the input string is null or empty
		if (str == null || str.isEmpty()) {
			return 0;
		}
	
		int maxStreak = 1;
		int currentStreak = 1;
	
		// Iterate through the string starting from the second character.
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				currentStreak++;
			} else {
				currentStreak = 1;
			}
	
			if (currentStreak > maxStreak) {
				maxStreak = currentStreak;
			}
		}
	
		return maxStreak;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

