package snackBar;

public class Customer
{
    private static int maxID = 0;
    private int id;
    private String name;

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

    public int setID()
    {
        this.id = ++maxID;
    }

    public String setName(String name)
    {
        this.name = name;
    }

    public double addCash(double addedCash)
    {
        this.cash += addedCash;
    }

    public double buy(double amount)
    {
        this.cash -= amount;
    }
} 