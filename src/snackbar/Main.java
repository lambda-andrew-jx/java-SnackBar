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

    	Snack chips = new Snack("Chips", 36, 1.75, food.getId());
    	Snack chocobar = new Snack("Chocolate Bar", 36, 1.0, food.getId());
    	Snack pretzel = new Snack("Pretzel", 30, 2.0, food.getId());

    	Snack soda = new Snack("Soda", 24, 2.5, drink.getId());
    	Snack water = new Snack("Water", 20, 2.75, drink.getId());
        
        //Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
    	c1.setCash(soda.buySnack(c1.getCash(), 4));

    	//Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.

    	c1.setCash(pretzel.buySnack(c1.getCash(), 3));

    	//Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.

    	c2.setCash(soda.buySnack(c2.getCash(), 4));

    	//Customer 1 finds $10. Print Customer 1 Cash on Hand.

    	c1.setCash(10);

    	//Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.

    	c1.setCash(chocobar.buySnack(c1.getCash(), 1));

    	//Add 12 more items to snack 3. Print quantity of snack 3.

    	pretzel.addQuantity(12);

    	//Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.

    	c2.setCash(pretzel.buySnack(c2.getCash(), 3));

    }
    
	public static void main(String[] args)
	{
	   workWithData();
	}
}