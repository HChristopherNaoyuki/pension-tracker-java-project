package SRC;

// PensionReport.java

import java.util.List;

public class PensionReport 
{
    private final List<Pensioner> pensioners;

    public PensionReport(List<Pensioner> pensioners) 
    {
        this.pensioners = pensioners;
    }

    // Print report for all pensioners, regardless of pension type
    public void printPensionersReport() 
    {
        System.out.println("ID NUMBER\tNAME\t\tMONTHLY AMOUNT (R)");

        for (Pensioner pensioner : pensioners) 
        {
            System.out.println(pensioner);
        }
    }
}
