package snackApp; 

public class Main 
{
	private static void workWithData()
	{
		Buyer jane = new Buyer("Jane", 45.25);
        Buyer bob = new Buyer("Bob", 33.14);

        Vendingmachine food = new Vendingmachine("Food");
        Vendingmachine drink = new Vendingmachine("Drink");
        Vendingmachine office = new Vendingmachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getID());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getID()); 
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getID());

        Snack soda = new Snack("Soda", 24, 2.50, drink.getID());
        Snack water = new Snack("Water", 20, 2.75, drink.getID());
        
        System.out.println("\n");
        System.out.println("Jane bought 3 sodas");
        jane.buy(soda.getTotalCost(3));
        soda.buy(3);
        System.out.println("\n");

        System.out.println("Jane has: " + "$" + jane.getCash());
        System.out.println("\n");

        System.out.println("Sodas Left: " + soda.getQuantity());
        System.out.println("\n");

        System.out.println("Jane bought 1 pretzel");
        jane.buy(pretzel.getTotalCost(1));
        pretzel.buy(1);
        System.out.println("\n");

        System.out.println("Jane has: " + "$" + jane.getCash());
        System.out.println("\n");

        System.out.println("Pretzels Left: " + pretzel.getQuantity());
        System.out.println("\n");

        System.out.println("Bob bought 2 sodas");
        bob.buy(soda.getTotalCost(2));
        soda.buy(2);
        System.out.println("\n");

        System.out.println("Bob has: " + "$" + bob.getCash());
        System.out.println("\n");

        System.out.println("Sodas Left: " + soda.getQuantity());
        System.out.println("\n");

        System.out.println("Jane found $10");
        jane.addCash(10.00);
        System.out.println("\n");

        System.out.println("Jane has: " + "$" + jane.getCash());
        System.out.println("\n");

        System.out.println("Jane bought 1 Chocolate Bar");
        jane.buy(chocolateBar.getTotalCost(1));
        chocolateBar.buy(1);
        System.out.println("\n");

        System.out.println("Jane has: " + "$" + jane.getCash());
        System.out.println("\n");

        System.out.println("Chocolate Bars Left: " + chocolateBar.getQuantity());
        System.out.println("\n");

        System.out.println("Vendor Added 12 more pretzels");
        pretzel.addQuantity(12);
        System.out.println("\n");

        System.out.println("Pretzels Left: " + pretzel.getQuantity());
        System.out.println("\n");

        System.out.println("Bob bought 3 pretzels");
        bob.buy(pretzel.getTotalCost(3));
        pretzel.buy(3);
        System.out.println("\n");

        System.out.println("Bob has: " + "$" + bob.getCash());
        System.out.println("\n");

        System.out.println("Pretzels Left: " + pretzel.getQuantity());
        System.out.println("\n");
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}