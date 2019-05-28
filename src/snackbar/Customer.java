package snackbar;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;
	

	public Customer(String name, double cashOnHand)
	{
		maxId++;
		this.id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	public double setCash(double cashOnHand, double price)
	{
		if(cashOnHand == price)
		{
			this.cashOnHand = cashOnHand - price;
		}else
		{
            this.cashOnHand = cashOnHand;
		}
		return cashOnHand;
	} 
	// public double setCashOnHand(double cashOnHand)
	// {
	// 	this.cashOnHand = cashOnHand;
	// }
}