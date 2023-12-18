import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AssignmentCalculatorGUI extends JFrame {
    private JLabel lblTotalPoints;
    private JLabel lblEarnedPoints;
    private JLabel lblPercentage;
    private JTextField txtTotalPoints;
    private JTextField txtEarnedPoints;
    private JTextField txtPercentage;
    private JButton btnCalculate;
    private JLabel lblTotalScore;

    private WeightedGrades weightedGrades;

    public AssignmentCalculatorGUI() {
        //GUI Label Description
        setTitle("Assignment Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        lblTotalPoints = new JLabel("Total Assignment Points:");
        lblEarnedPoints = new JLabel("Earned Points:");
        lblPercentage = new JLabel("Percentage of Class:");
        txtTotalPoints = new JTextField();
        txtEarnedPoints = new JTextField();
        txtPercentage = new JTextField();
        btnCalculate = new JButton("Click to calculate Score");
        lblTotalScore = new JLabel("Weighted Score: ");

        // Add components to the frame
        add(lblTotalPoints);
        add(txtTotalPoints);
        add(lblEarnedPoints);
        add(txtEarnedPoints);
        add(lblPercentage);
        add(txtPercentage);
        add(new JLabel()); // Placeholder for spacing
        add(btnCalculate);
        add(lblTotalScore);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotalScore();
            }
        });
    }

    private void calculateTotalScore() {
        //try-catch to for data input entry
        try {
            double totalPoints = Double.parseDouble(txtTotalPoints.getText());
            double earnedPoints = Double.parseDouble(txtEarnedPoints.getText());
            double percentage = Double.parseDouble(txtPercentage.getText());

            weightedGrades = new WeightedGrades(totalPoints, earnedPoints, percentage);
            double totalScore = weightedGrades.calculateTotalScore();
            lblTotalScore.setText("Total Score: " + totalScore);
        } catch (NumberFormatException e) {
            lblTotalScore.setText("Invalid input. Please enter valid numbers.");
        }
    }
}