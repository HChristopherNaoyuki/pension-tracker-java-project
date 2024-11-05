package SRC;

// Pensioner.java

public class Pensioner 
{
    private final int id;
    private final String surname;
    private final double pensionAmount;
    private final char pensionCode;

    public Pensioner(int id, String surname, double pensionAmount, char pensionCode) 
    {
        this.id = id;
        this.surname = surname;
        this.pensionAmount = pensionAmount;
        this.pensionCode = pensionCode;
    }

    public int getId() 
    {
        return id;
    }

    public String getSurname() 
    {
        return surname;
    }

    public double getPensionAmount() 
    {
        return pensionAmount;
    }

    public char getPensionCode() 
    {
        return pensionCode;
    }

    @Override
    public String toString() 
    {
        return String.format("%d\t\t%s\t\tR%.2f", id, surname, pensionAmount);
    }
}
