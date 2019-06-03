package snackbarApp;

public class Main
{
    private static void workWithData()
    {
       Customer cust1 = new Customer("Jane", 45.25);
       Customer cust2 = new Customer("Bob", 33.14);

       VendingMachine vm1 = new VendingMachine("Food");
       VendingMachine vm2 = new VendingMachine("Drink");
       VendingMachine vm3 = new VendingMachine("Office");

       Snack snack1 = new Snack("Chips", 36, 1.75, vm1.getId());
       Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
       Snack snack3 = new Snack("Pretzel", 30, 2.00, vm1.getId());

       Snack snack4 = new Snack("Soda", 24, 2.50, vm2.getId());
       Snack snack5 = new Snack("Water", 20, 2.75, vm2.getId());

       System.out.println(snack4.buySnack(3));
       System.out.println(cust1.buySnack(snack4.totalCost(2.50, 3););)
    }

    public static void main(String[] args)
    {
        // start
        workWithData();
    }
}