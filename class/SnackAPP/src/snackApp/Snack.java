package snackApp;

public class Snack 
{
	private static int maxID = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineID;

	public Snack(String name, int quantity, double cost, int vendingMachineID)
	{
		setID();
		this.name = name;
		this.quantity = quantity;
		this.cost = cost; 
		this.vendingMachineID = vendingMachineID;
	}

	    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public int getVendingMachineID()
    {
        return vendingMachineID;
    }

    public void setID()
    {
        this.id = ++maxID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setVendingMachineID(int vendingMachineID)
    {
        this.vendingMachineID = vendingMachineID;
    }

    public void addQuantity(int num)
    {
        this.quantity += num;
    }

    public void buy(int num)
    {
        this.quantity -= num;
    }

    public double getTotalCost(double amount)
    {
        return amount*this.cost;
    }
}
