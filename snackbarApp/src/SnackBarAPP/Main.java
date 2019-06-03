package SnackBarAPP; 

public class Main
{
    private static void workWithData()
    {
        Customer C1 = new Customer("Jane");
        Customer C2 = new Customer("Bob");

        VendingMachine V1 = new VendingMachine("Food");
        VendingMachine V2 = new VendingMachine("Drink");
        VendingMachine V3 = new VendingMachine("Office");
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