public class WeightedGrades {
    private double totalPointsPossible;
    private double earnedPoints;
    private double percentage;

    //constructor WweightedGrades instance
    public WeightedGrades(double totalPointsPossible, double earnedPoints, double percentage) {
        this.totalPointsPossible = totalPointsPossible;
        this.earnedPoints = earnedPoints;
        this.percentage = percentage;
    }

    //calculate weighted total score
    public double calculateTotalScore() {
        return (earnedPoints / totalPointsPossible) * percentage;
    }
}