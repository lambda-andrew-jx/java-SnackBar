package snackBar;

public class Customer
{
    private static int maxID = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash)
    {
        setID();

        this.name = name;
        this.cash = cash;
    }

    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return this.name;
    }

    public double getCash()
    {
        return this.cash;
    }

    public void setID()
    {
        this.id = ++maxID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addCash(double addedCash)
    {
        this.cash += addedCash;
    }

    public void buy(double amount)
    {
        this.cash -= amount;
    }
} 