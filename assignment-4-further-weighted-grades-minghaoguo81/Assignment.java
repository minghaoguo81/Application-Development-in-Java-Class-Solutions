public class Assignment {
    //Instantiate assignment class that includes grades and percentages for all number of assignments
    
    private double grade;
    private double percentage;

    public Assignment(double grade, double percentage) {
        this.grade = grade;
        this.percentage = percentage;
    }

    public double getGrade() {
        return grade;
    }

    public double getPercentage() {
        return percentage;
    }
}