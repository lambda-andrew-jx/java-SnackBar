package SnackBar;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double quantity;
    private double cost;
    // vid = vendor id
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

    public double setQuantity(double quantity)
    {
        this.quantity = quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public double setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVid()
    {
        return vid;
    }

    public int setVid(int vid)
    {
        this.vid = vid;
    }

    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                         "name: " + name + "\n" +
                         "quantity: " + quantity + "\n" +
                         "cost: " + cost + "\n" +
                         "vid: " + vid + "\n";
        return rtnStr;
    }
}

