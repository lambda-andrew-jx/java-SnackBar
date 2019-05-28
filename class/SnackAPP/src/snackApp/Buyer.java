package snackApp;

public class Buyer
{
    private static int maxID = 0;
    private int id;
    private String name;
    private double cash;

    public Buyer(String name, double cash)
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

    public void addCash(double addCash)
    {
        this.cash += addCash;
    }

    public void buy(double amount)
    {
        this.cash -= amount;
    }
} 