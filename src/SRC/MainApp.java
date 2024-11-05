package SRC;

// MainApp.java

import java.util.ArrayList;
import java.util.List;

public class MainApp 
{
    public static void main(String[] args) 
    {
        String filename = "pensioner.txt";

        // Initialize PensionFileHandler
        PensionFileHandler fileHandler = new PensionFileHandler(filename);

        // Sample data to be written once
        List<Pensioner> samplePensioners = new ArrayList<>();
        samplePensioners.add(new Pensioner(1234, "Nkosi", 503.99, 'g'));
        samplePensioners.add(new Pensioner(1444, "Patel", 527.99, 'g'));
        samplePensioners.add(new Pensioner(2341, "Botha", 595.66, 'p'));

        // Overwrite file with sample data
        fileHandler.initializeFile(samplePensioners);

        // Read all pensioners from file
        List<Pensioner> pensioners = fileHandler.readPensioners();

        // Generate and print the report including all pensioners
        PensionReport report = new PensionReport(pensioners);
        report.printPensionersReport();
    }
}
