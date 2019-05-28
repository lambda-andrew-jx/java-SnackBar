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

    public double getPrice()
    {
    	return price;
    }

    public void setPrice(double price)
    {
    	this.price = price;
    }

    public int getVmId()
    {
    	return vmId;
    }

    public void setVmId(int vmId)
    {
    	this.vmId = vmId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int quantity, int newQuantity)
    {
        this.quantity = quantity + newQuantity;
    }

    public void buySnack(int quantity, int newQuantity)
    {
        this.quantity = quantity - newQuantity;
    }

    public void addMoney(double price, double newPrice)
    {
        this.price = price + newPrice;
    }


}