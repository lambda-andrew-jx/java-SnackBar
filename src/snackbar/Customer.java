package snackbar;

public class Customer
{
	private static int maxId = 0;
	private String name;
	private double cashOnHand;
	private 

	public Customer(String name, double cashOnHand)
	{
		maxId++
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
	}

	public void getCashOnHand()
	{
		return cashOnHand;
	}
}