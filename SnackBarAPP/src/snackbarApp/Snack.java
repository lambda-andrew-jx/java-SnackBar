package snackbarApp;

public class Snack
{
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quanitity;
    private double cost;
    private int vendingID;

    public static int addQuanity;
    public static double buySnacks;
    public static double totalCost;

    public Snack(String name, int quanitity, double cost, int vendingID)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quanitity = quanitity;
        this.cost = cost;
        this.vendingID = vendingID;
    }

    //getters and setters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getQuanitity()
    {
        return quanitity;
    }

    public void setQuanitity(int quanitity)
    {
        this.quanitity = quanitity;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingID()
    {
        return vendingID;
    }

    public void setVendingID()
    {
        this.vendingID = vendingID;
    }
}