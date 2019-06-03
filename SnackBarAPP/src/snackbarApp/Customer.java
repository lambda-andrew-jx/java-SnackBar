package snackbarApp;

public class Customer
{

    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //getters and setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    public void addCash(double cashOnHand)
    {
        this.cashOnHand += cashOnHand;
    }

    public void buySnack(double cashOnHand)
    {
        this.cashOnHand -= cashOnHand;
    }
}