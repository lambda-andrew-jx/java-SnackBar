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

        snack4.buySnack(3);
        cust1.buySnack(snack4.totalCost(snack4.getCost(), 3));

        System.out.println(cust1.getName() + " has " + cust1.getCashOnHand() + " dollars left in hand");
        System.out.println("there are " + snack4.getQuantity() + " units left of snack 4 in the vending machine");
        System.out.println();
        
        snack3.buySnack(1);
        cust1.buySnack(snack3.totalCost(snack3.getCost(), 1));

        System.out.println(cust1.getName()  + " has " + cust1.getCashOnHand() + " dollars left in hand");
        System.out.println("there are " + snack3.getQuantity() + " units left of snack 3 in the vending machine");
        System.out.println();

        snack4.buySnack(2);
        cust2.buySnack(snack4.totalCost(snack4.getCost(), 2));

        System.out.println(cust2.getName()  + " has " + cust2.getCashOnHand() + " dollars left in hand");
        System.out.println("there are " + snack4.getQuantity() + " units left of snack 4 in the vending machine");
        System.out.println();

        cust1.addCash(10);

        System.out.println(cust1.getName()  + " has " + cust1.getCashOnHand() + " dollars left in hand");
        System.out.println();

        snack2.buySnack(1);
        cust1.buySnack(snack2.totalCost(snack2.getCost(), 1));

        System.out.println(cust1.getName()  + " has " + cust1.getCashOnHand() + " dollars left in hand");
        System.out.println("there are " + snack2.getQuantity() + " units left of snack 2 in the vending machine");
        System.out.println();

        snack3.addSnack(12);

        System.out.println("there are " + snack3.getQuantity() + " units left of snack 3 in the vending machine");
        System.out.println();

        snack3.buySnack(3);
        cust2.buySnack(snack3.totalCost(snack3.getCost(), 3));

        System.out.println(cust2.getName()  + " has " + cust2.getCashOnHand() + " dollars left in hand");
        System.out.println("there are " + snack3.getQuantity() + " units left of snack 3 in the vending machine");
        System.out.println();
        
        System.out.println(snack1);
        System.out.println("vending machine name: " + vm1.getName());
        System.out.println("total cost: " + snack1.totalCost(snack1.getCost(), snack1.getQuantity()));
        System.out.println();

        System.out.println(snack2);
        System.out.println("vending machine name: " + vm1.getName());
        System.out.println("total cost: " + snack2.totalCost(snack2.getCost(), snack2.getQuantity()));
        System.out.println();

        System.out.println(snack3);
        System.out.println("vending machine name: " + vm1.getName());
        System.out.println("total cost: " + snack3.totalCost(snack3.getCost(), snack3.getQuantity()));
        System.out.println();

        System.out.println(snack4);
        System.out.println("vending machine name: " + vm2.getName());
        System.out.println("total cost: " + snack4.totalCost(snack4.getCost(), snack4.getQuantity()));
        System.out.println();

        System.out.println(snack5);
        System.out.println("vending machine name: " + vm2.getName());
        System.out.println("total cost: " + snack5.totalCost(snack5.getCost(), snack5.getQuantity()));
    }

    public static void main(String[] args)
    {
        // start
        workWithData();
    }
}