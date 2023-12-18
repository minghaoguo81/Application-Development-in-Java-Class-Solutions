import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        //entry point to run GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AssignmentCalculatorGUI calculator = new AssignmentCalculatorGUI();
                calculator.setVisible(true);
            }
        });
    }
}
