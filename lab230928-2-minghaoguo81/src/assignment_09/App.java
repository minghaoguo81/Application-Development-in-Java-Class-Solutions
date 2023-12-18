package assignment_09;

import ignore.TestingUtils;

public class App {


	/**

	Given 2 positive int arguments (a, b), return whichever argument is 
	nearest to the number 21 without going over.
	Return 0 if they both go over 21. 
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		nearestTwentyOne(19, 21)   <b>---></b> 21 <br>
		nearestTwentyOne(21, 19)    <b>---></b> 21 <br>
		nearestTwentyOne(19, 22) <b>---></b> 19 <br>
		nearestTwentyOne(32, 22) <b>---></b> 0 <br>
	 */
	
	public static int nearestTwentyOne(int a, int b) {
		 // Calculate the differences using Math.abs
		 int A_diff = Math.abs(a - 21);
		 int B_diff = Math.abs(b - 21);
		 
		 // Check the value that is nearest to 21
		 if (A_diff <= 21 && B_diff > 21) {
			 return a;
		 } 
		 else if (B_diff <= 21 && A_diff > 21) {
			 return b;
		 } 
		 else if (A_diff <= 21 && B_diff <= 21) {
			 // If both values are 21 or less, return the smaller one
			 return Math.min(a, b);
		 } 
		 else {
			 // If both values go over 21
			 return 0;
		 }
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
