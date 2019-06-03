package snackbarApp;

public class Snack
{
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingID;

    public Snack(String name, int quantity, double cost, int vendingID)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
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

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
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

    public void setVendingID(int vendingID)
    {
        this.vendingID = vendingID;
    }

    public void addSnack(int quantity)
    {
        this.quantity += quantity;
    }

    public void buySnack(int quantity)
    {
        this.quantity -= quantity; 
    }

    public void totalCost(double cost, int quantity)
    {
        this.cost = (cost * quantity);
    }
}