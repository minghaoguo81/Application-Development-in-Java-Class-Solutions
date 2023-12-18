//Class to calculate weighted grade
public class WeightedGradeCalculator {
    //Initialize variables
    private double pointTotal;
    private double earnedPoints;
    private double assignmentPercentage;
    private double totalWeightedGrade;

    //Constructor
    public WeightedGradeCalculator(double pointTotal, double earnedPoints, double assignmentPercentage) {
        this.pointTotal = pointTotal;
        this.earnedPoints = earnedPoints;
        this.assignmentPercentage = assignmentPercentage;
        calculateTotalWeightedGrade();
    }

    //Getter for point total
    public double getPointTotal() {
        return pointTotal;
    }

    //setter for point total
    public void setPointTotal(double pointTotal) {
        this.pointTotal = pointTotal;
        calculateTotalWeightedGrade();
    }

    //getter for earned points
    public double getEarnedPoints() {
        return earnedPoints;
    }

    //setter for earned points
    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
        calculateTotalWeightedGrade();
    }

    //getter for assignmnet percentage
    public double getAssignmentPercentage() {
        return assignmentPercentage;
    }

    //setter for assignment percentage
    public void setAssignmentPercentage(double assignmentPercentage) {
        this.assignmentPercentage = assignmentPercentage;
        calculateTotalWeightedGrade();
    }

    //getter for total weighted grade
    public double getTotalWeightedGrade() {
        return totalWeightedGrade;
    }

    //method for calculation
    private void calculateTotalWeightedGrade() {
        totalWeightedGrade = earnedPoints / pointTotal * assignmentPercentage;
    }
}