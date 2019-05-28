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
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}