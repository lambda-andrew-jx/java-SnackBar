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
		this.cash = cash;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	} 

	public void getCash()
	{
		return cash;
	}

	public void buySnack(double cash)
	{
		double cashOnPocket = this.cash;
		this.cash = cash;

		System.out.println(this.name + "has $" + cashOnPocket + "and now has $ " + cash + " left \n");
	}
}