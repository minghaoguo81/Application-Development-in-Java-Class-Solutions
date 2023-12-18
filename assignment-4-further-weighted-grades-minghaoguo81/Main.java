import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //asks for user input of total number of assignments
        System.out.print("Enter the total number of assignments: ");
        int totalAssignments = input.nextInt();

        //asks user input of total number of assignments
        WeightedGrade calculator = new WeightedGrade(totalAssignments);
        calculator.inputAssignmentDetails();

        //calculate Final Grade and output Final Grade
        double finalGrade = calculator.calculateFinalGrade();
        System.out.println("Final Grade: " + finalGrade);

        //Convert Final Grade to Letter Grade and ouput Letter Grade
        String letterGrade = GradeConverter.assignLetterGrade(finalGrade);
        System.out.println("Letter Grade: " + letterGrade);
    }
}
