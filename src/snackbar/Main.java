package snackbar;

public class Main
{
    private static void workWithData()
    {
    	Customer c1 = new Customer("Jane", 44.25);
    	Customer c2 = new Customer("Bob", 33.14);

    	VendingMachine food = new VendingMachine("Food");
    	VendingMachine drink = new VendingMachine("Drink");
    	VendingMachine office = new VendingMachine("Office");

    	Snack chips = new Snack("Chips", 36, 1.75, food.id);
    	Snack chocobar = new Snack("Chocolate Bar", 36, 1.0, food.id);
    	Snack pretzel = new Snack("Pretzel", 30, 2.0, food.id);

    	Snack soda = new Snack("Soda", 24, 2.5, drink.id);
    	Snack water = new Snack("Water", 20, 2.75, drink.id);

    	System.out.println("***Query Data");




    }
    
	public static void main(String[] args)
	{
	   workWithData();
	}
}