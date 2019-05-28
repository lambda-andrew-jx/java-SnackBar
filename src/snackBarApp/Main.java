package snackBarApp;

public class Main {
	private static void workWithData() {
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		VendingMachine v1 = new VendingMachine("Food");
		VendingMachine v2 = new VendingMachine("Drink");
		VendingMachine v3 = new VendingMachine("Office");

		Snack snack1 = new Snack("Chips", 36, 1.75, v1.getId());
		Snack snack2 = new Snack("Chocolate", 36, 1.00, v1.getId());
		Snack snack3 = new Snack("pretzel", 30, 2.00, v1.getId());
		Snack snack4 = new Snack("Soda", 24, 2.50, v2.getId());
		Snack snack5 = new Snack("Water", 20, 2.75, v2.getId());

		c1.buy(snack4.getTotalCost(3));
		snack4.buySnacks(3);
		System.out.println("Cash on hand (c1): " + c1.getCash() + "\n");
		System.out.println("Snacks left (snack4): " + snack4.getQuantity() + "\n\n");

		c1.buy(snack3.getTotalCost(1));
		snack3.buySnacks(1);
		System.out.println("Cash on hand (c1): " + c1.getCash() + "\n");
		System.out.println("Snacks left (snack3): " + snack3.getQuantity() + "\n\n");

		c2.buy(snack4.getTotalCost(2));
		snack4.buySnacks(2);
		System.out.println("Cash on hand (c2): " + c2.getCash() + "\n");
		System.out.println("Snacks left (snack4): " + snack4.getQuantity() + "\n\n");

		c1.addCash(10.0);
		System.out.println("Cash on hand (c1): " + c1.getCash() + "\n\n");

		c1.buy(snack2.getTotalCost(1));
		snack2.buySnacks(1);
		System.out.println("Cash on hand (c1): " + c1.getCash() + "\n");
		System.out.println("Snacks left (snack2): " + snack2.getQuantity() + "\n\n");

		snack3.addQuantity(12);
		System.out.println("Snacks left (snack3): " + snack3.getQuantity() + "\n\n");

		c2.buy(snack3.getTotalCost(3));
		snack3.buySnacks(3);
		System.out.println("Cash on hand (c2): " + c2.getCash() + "\n");
		System.out.println("Snacks left (snack3): " + snack3.getQuantity() + "\n\n");

		// System.out.println("Name: " + snack1);
		// System.out.println("Vending Machine Name: " + snack1.);
		// System.out.println("Quantity: " + snack1.getQuantity);
		// System.out.println("Total Cost of all Snacks: " + snack1.getTotalCost(snack1.getQuantity()));
	}

	public static void main(String[] args) {
		workWithData();
	}
}