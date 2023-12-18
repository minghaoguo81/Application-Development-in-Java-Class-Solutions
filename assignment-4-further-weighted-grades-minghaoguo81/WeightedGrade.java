import java.util.Scanner;

public class WeightedGrade {
    private Assignment[] assignments;

    public WeightedGrade(int totalAssignments) {
        assignments = new Assignment[totalAssignments];
    }

    public void inputAssignmentDetails() {
        //asks for user input of  grade and percentage for each assignment
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < assignments.length; i++) {
            System.out.print("Enter grade for Assignment " + (i + 1) + ": ");
            double grade = input.nextDouble();
            assignments[i] = new Assignment(grade, 0);
        }

        for (int i = 0; i < assignments.length; i++) {
            System.out.print("Enter percentage for Assignment " + (i + 1) + ": ");
            double percentage = input.nextDouble();
            assignments[i] = new Assignment(assignments[i].getGrade(), percentage);
        }
    }

    public double calculateFinalGrade() {
        double totalPercentage = 0;
        double finalGrade = 0;

        //calculate final grade
        for (Assignment assignment : assignments) {
            totalPercentage += assignment.getPercentage();
            finalGrade += (assignment.getGrade() * (assignment.getPercentage() / 100));
        }

        //if the percentages don't add up to 100, asks for user input the grade again
        if (totalPercentage != 100) {
            System.out.println("Percentage total does not add up to 100. Please re-enter.");
            inputAssignmentDetails();
            return calculateFinalGrade();
        }

        return finalGrade;
    }
}
