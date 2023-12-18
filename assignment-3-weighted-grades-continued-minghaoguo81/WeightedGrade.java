import java.util.Scanner;

public class WeightedGrade {
    //initialize variables
    private double[] grades;
    private double[] percentages;

    //method to instantialiate variables
    public WeightedGrade() {
        grades = new double[8];
        percentages = new double[8];
    }

    //method to ask and read user input of grades and percentages
    public void inputGradesAndPercentages() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grades for each 8 assignment:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Grade" + ": ");
            grades[i] = scanner.nextDouble();
        }

        System.out.println("Enter percentages for each 8 assignment:");
        double totalPercentage = 0;
        for (int i = 0; i < percentages.length; i++) {
            System.out.print("Percentage" + ": ");
            percentages[i] = scanner.nextDouble();
            totalPercentage += percentages[i];
        }
    }

    //method to calculate the final grade
    public double calculateFinalGrade() {
        double finalGrade = 0;
        for (int i = 0; i < grades.length; i++) {
            finalGrade += (grades[i] * (percentages[i] / 100));
        }
        return finalGrade;
    }

    //method to determine the letter grade based on final grade
    public String assignLetterGrade(double finalGrade) {
        if (finalGrade >= 90) {
            return "A";
        } else if (finalGrade >= 80) {
            return "B";
        } else if (finalGrade >= 70) {
            return "C";
        } else if (finalGrade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    //main
    public static void main(String[] args) {
        WeightedGrade weightedGrade = new WeightedGrade();
        weightedGrade.inputGradesAndPercentages();

        double finalGrade = weightedGrade.calculateFinalGrade();
        System.out.println("Final Grade: " + finalGrade);
        
        String letterGrade = weightedGrade.assignLetterGrade(finalGrade);
        System.out.println("Letter Grade: " + letterGrade);
    }
}
