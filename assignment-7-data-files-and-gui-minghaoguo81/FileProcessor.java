import java.io.*;
import java.util.ArrayList;
import java.util.List;

// FileProceser class to call the class in GUI and validate input
public class FileProcessor {
    private String fileName;
    private List<String> dataLines;

    public FileProcessor(String fileName) {
        this.fileName = fileName;
        dataLines = new ArrayList<>();
    }

    // caller to read data
    public void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                dataLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // caller to read data
    public void writeData(String newFileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getDataLines() {
        return dataLines;
    }
}