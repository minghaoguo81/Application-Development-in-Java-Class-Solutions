import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

// GUI Class
public class FileProcessorGUI {
    private JFrame frame;
    private JTextField fileNameTextField;
    private JButton readFileButton;
    private JTextArea readDataTextArea;
    private JButton writeFileButton;
    private JTextField newFileNameTextField;
    private JTextArea writeDataTextArea;

    private FileProcessor fileProcessor;
    private String firstFiveLinesData;

    public FileProcessorGUI(FileProcessor processor) {
        fileProcessor = processor;

        frame = new JFrame("File Processor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLayout(new GridLayout(1, 2));  // Two columns for reading and writing

        // Left panel for reading
        JPanel readPanel = new JPanel(new BorderLayout());
        fileNameTextField = new JTextField("annual.csv");
        readFileButton = new JButton("Read File");
        readDataTextArea = new JTextArea(15, 30);
        readDataTextArea.setEditable(false);  // Make read-only
        readPanel.add(new JLabel("File Name:"), BorderLayout.NORTH);
        readPanel.add(fileNameTextField, BorderLayout.NORTH);
        readPanel.add(readFileButton, BorderLayout.CENTER);
        readPanel.add(new JScrollPane(readDataTextArea), BorderLayout.SOUTH);

        // Right panel for writing and displaying written data
        JPanel writePanel = new JPanel(new BorderLayout());
        writeFileButton = new JButton("Write File");
        newFileNameTextField = new JTextField("user_input.csv");
        writeDataTextArea = new JTextArea(15, 30);
        writeDataTextArea.setEditable(false);  // Make read-only
        writePanel.add(new JLabel("New File Name:"), BorderLayout.NORTH);
        writePanel.add(newFileNameTextField, BorderLayout.NORTH);
        writePanel.add(writeFileButton, BorderLayout.CENTER);
        writePanel.add(new JScrollPane(writeDataTextArea), BorderLayout.SOUTH);

        frame.add(readPanel);
        frame.add(writePanel);

        // Set button colors
        readFileButton.setBackground(Color.BLUE);
        readFileButton.setForeground(Color.WHITE);
        writeFileButton.setBackground(Color.GREEN);
        writeFileButton.setForeground(Color.WHITE);

        readFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readData();
            }
        });

        writeFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writeData();
            }
        });
    }

    // Method to read data from input file
    public void readData() {
        String fileName = fileNameTextField.getText();
        fileProcessor = new FileProcessor(fileName);
        fileProcessor.readData();

        List<String> lines = fileProcessor.getDataLines();
        StringBuilder linesText = new StringBuilder();
        StringBuilder firstFiveLines = new StringBuilder();

        // Display the label for the first five lines
        linesText.append("First five lines of file:\n\n");

        // Skip the header line
        for (int i = 1; i < lines.size() && i <= 5; i++) {
            // Parse the first three fields
            String[] fields = lines.get(i).split(",");
            for (int j = 0; j < 3; j++) {
                firstFiveLines.append(fields[j]);
                if (j < 2) {
                    firstFiveLines.append(", ");
                }
            }
            firstFiveLines.append("\n");
        }

        firstFiveLinesData = firstFiveLines.toString();

        readDataTextArea.setText(linesText.toString() + firstFiveLinesData);
    }

    // Method to write data to output file
    public void writeData() {
        String newFileName = newFileNameTextField.getText();
        fileProcessor.writeData(newFileName, firstFiveLinesData);

        // Display the label for the first five lines and the first five lines of data
        writeDataTextArea.setText("First five lines of file:\n\n" + firstFiveLinesData);
    }

    public void display() {
        frame.setVisible(true);
    }
}





