package snackBar;

public class Main
{
    private static void workWithData()
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getID());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getID());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getID());

        Snack soda = new Snack("Soda", 24, 2.50, drink.getID());
        Snack water = new Snack("Water", 20, 2.75, drink.getID());

        System.out.println("Jane buys 3 sodas");
        jane.buy(soda.getTotalCost(3));
        soda.buy(3);
        System.out.println("Jane's money: " + jane.getCash());
        System.out.println("Sodas left: " + soda.getQuantity());
        
        System.out.println("Jane buys 1 pretzel");
        jane.buy(pretzel.getTotalCost(1));
        pretzel.buy(1);
        System.out.println("Jane's money: " + jane.getCash());
        System.out.println("Pretzels left: " + pretzel.getQuantity());

        System.out.println("Bob buys 2 sodas");
        bob.buy(soda.getTotalCost(2));
        soda.buy(2);
        System.out.println("Bob's money: " + bob.getCash());
        System.out.println("Sodas left: " + soda.getQuantity());

        System.out.println("Jane found ten dollary-doos");
        jane.addCash(10.00);
        System.out.println("Jane's money: " + jane.getCash());

        System.out.println("Jane buys 1 Chocolate Bar");
        jane.buy(chocolateBar.getTotalCost(1));
        chocolateBar.buy(1);
        System.out.println("Jane's money: " + jane.getCash());
        System.out.println("Chocolate Bars left: " + chocolateBar.getQuantity());

        System.out.println("Adding 12 more pretzels");
        pretzel.addQuantity(12);
        System.out.println("Pretzels left: " + pretzel.getQuantity());

        System.out.println("Bob buys 3 pretzels");
        bob.buy(pretzel.getTotalCost(3));
        pretzel.buy(3);
        System.out.println("Bob's money: " + bob.getCash());
        System.out.println("Pretzels left: " + pretzel.getQuantity());
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}