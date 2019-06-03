package SnackBarAPP; 

public class Main
{
    private static void workWithData()
    {
        Customer C1 = new Customer("Jane", 45.25);
        Customer C2 = new Customer("Bob", 33.14);

        VendingMachine Food = new VendingMachine("chips", 36, 1.75);
        VendingMachine Drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");
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