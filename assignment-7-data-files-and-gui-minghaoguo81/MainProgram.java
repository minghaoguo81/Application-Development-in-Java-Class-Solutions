public class MainProgram {
    public static void main(String[] args) {
        // Create FileProcessor instance to process the files
        FileProcessor fileProcessor = new FileProcessor("data.csv");

        // Create FileProcessorGUI instance for GUI interface
        FileProcessorGUI gui = new FileProcessorGUI(fileProcessor);
        gui.display();
    }
}