package SnackBar;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    // vid = vending id
    private int vid;

    public Snack(String name, double quantity, double cost, int vid )
    {
        maxId++;
        id=maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vid = vid;
    }

    public int getId()
    {
        return id;
    }

    public setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVid()
    {
        return vid;
    }

    public void setVid(int vid)
    {
        this.vid = vid;
    }

    public void addSnack(int amount)
    {
        this.quantity += amount;
    }

    public void buySnack(int amount)
    {
        this.quantity -= amount;
    }
}

