package snackbar;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double price;
	private int vmId;

	public Snack (String name, int quantity, double price, int vmId)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.vmId = vmId;
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

    public double getPrice()
    {
    	return price;
    }

    public void setPrice(double price)
    {
    	this.price = price;
    }

    public int getVmId(int vmId)
    {
    	return vmId;
    }

    public void setVmId(int vmId)
    {
        this.vmId = vmId;
    }

    public void addQuantity(int quantity)
    {
        if(quantity > 0)
        {
            this.quantity += 0;
        }else
        {
            System.out.println("Need to restock");
        }
    }

    public double buySnack(double custCoins, int numOfItem)
    {
        if(numOfItem <= this.quantity && this.price <= custCoins)
        {
            System.out.println("Your Total Is $" + getTotalPrice(numOfItem));
            this.quantity = this.quantity - numOfItem;
            System.out.println(this.quantity + " of this" + " " + this.name + " left in stock \n");
            return custCoins - getTotalPrice(numOfItem);
        }else 
        {
            System.out.println("Not money enough");
        }
        return custCoins;
    }

    private double getTotalPrice(int numOfItem)
    {
        return numOfItem * this.price;
    }


}