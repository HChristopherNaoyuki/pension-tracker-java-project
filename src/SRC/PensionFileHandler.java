package SRC;

// PensionFileHandler.java

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PensionFileHandler 
{
    private final String filename;

    public PensionFileHandler(String filename) 
    {
        this.filename = filename;
    }

    // Initialize file with sample data, overwriting if the file exists
    public void initializeFile(List<Pensioner> samplePensioners) 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
        {
            for (Pensioner pensioner : samplePensioners) 
            {
                writer.write(pensioner.getId() + "," + pensioner.getSurname() + "," +
                             pensioner.getPensionAmount() + "," + pensioner.getPensionCode());
                writer.newLine();
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read all pensioners' data from the file
    public List<Pensioner> readPensioners() 
    {
        List<Pensioner> pensioners = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String surname = parts[1];
                double pensionAmount = Double.parseDouble(parts[2]);
                char pensionCode = parts[3].charAt(0);

                Pensioner pensioner = new Pensioner(id, surname, pensionAmount, pensionCode);
                pensioners.add(pensioner);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return pensioners;
    }
}
