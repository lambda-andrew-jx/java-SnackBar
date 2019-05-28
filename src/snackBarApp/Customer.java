package snackBarApp;

public class Customer {

	// variables
	private int maxId = 0;
	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash) {
		this.id = maxId++;
		this.name = name;
		this.cash = cash;
	}

	// getters
	public String getName() { return name; }

	public double getCash() { return cash; }

	// setters
	public void setName(String name) { this.name = name; }

	//other methods
	public void addCash(double newCash) { this.cash += newCash; }

	public void buy(double cashUsed) { this.cash -= cashUsed; }
}	