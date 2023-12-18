public class GradeConverter {
    //convert final grade into letter grade based on percentages

    public static String assignLetterGrade(double finalGrade) {
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
}
