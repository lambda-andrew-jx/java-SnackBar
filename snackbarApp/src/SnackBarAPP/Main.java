package SnackBarAPP; 

public class Main
{
    private static void workWithData()
    {
        Customer C1 = new Customer("Jane", 45.25);
        Customer C2 = new Customer("Bob", 33.14);

        VendingMachine V1 = new VendingMachine("Food");
        VendingMachine V2 = new VendingMachine("Drink");
        VendingMachine V3 = new VendingMachine("Office");

        Snack S1 = new Snack ("chips", "Food", 36, 1.75);
        Snack S2 = new Snack ("chocolatte bar", "Food", 36, 1.00);
        Snack S3 = new Snack ("pretzel", "Food", 30, 2.00);
    }
    public static void main(String[] args)
    {
        workWithData();
    }

}



//public void buySnack(int quantity)
//{
   // this.quanity -= quantity
//}