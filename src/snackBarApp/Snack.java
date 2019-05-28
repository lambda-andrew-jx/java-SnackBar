package snackBarApp;

public class Snack {

	// variables
	private static int maxId = 0;

	public int id;
	public String name;
	public int quantity;
	public double cost;
	public int vendingMachineId;

	// constructor
	public Snack(String name, int quantity, double cost, int vendingMachineId) {
		this.id = maxId++;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// getters
	public int getId() { return id; }

	public String getName() { return name; }

	public double getCost() { return cost; }

	public int getVendingMachineId() { return vendingMachineId; }

	public int getQuantity() { return quantity; }

	// setters
	public void setId(int id) { this.id = id; }

	public void setName(String name) { this.name = name; }

	public void setCost(int cost) { this.cost = cost; }

	public void setVendingMachineId( int vendingMachineId ) { this.vendingMachineId = vendingMachineId; }

	//other methods
	public void addQuantity(int howMany) { this.quantity += howMany; }

	public void buySnacks(int howMany) { 
		this.quantity -= howMany;
	}

	public double getTotalCost(int howMany) { return cost * howMany; }
}