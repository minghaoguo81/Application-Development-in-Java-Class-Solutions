import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Print and scan input for all variables required
        System.out.print("Point Total = ");
        double pointTotal = scanner.nextDouble();

        System.out.print("Earned Points = ");
        double earnedPoints = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Assignment % = ");
        //double assignmentPercentage = scanner.nextDouble();
        double assignmentPercentage = Double.parseDouble(scanner.nextLine().replace("%",""));

        //Instantiate Class to calculate the weighted grade
        WeightedGradeCalculator calculator = new WeightedGradeCalculator(pointTotal, earnedPoints, assignmentPercentage);

        //Print weighted grade
        System.out.print("Total Weighted Grade = ");

        //set decimal places to 3
        NumberFormat formatter = new DecimalFormat("#0.000");     
        System.out.println(formatter.format(calculator.getTotalWeightedGrade()));

        scanner.close();
    }
}