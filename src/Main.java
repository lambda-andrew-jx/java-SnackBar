public class Main {


    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        System.out.println("Another print statement");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 =new Customer("Bob",3.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());

        Snack s4= new Snack ("Soda", 24, 2.50, v2.getId());
        Snack s5=new Snack ("Water",20, 2.75, v2.getId());

        c1.buySnack(3, s4);
        System.out.println("Cash on Hand of Jane (Customer1)" + c1.getCashOnHand());
        System.out.println("Quantity of Snack 4" + s4.getQuantity());

        c1.buySnack(1, s3);
        System.out.println("Cash on Hand of Jane (Customer1)" + c1.getCashOnHand());
        System.out.println("Quantity of Snack3" + s3.getQuantity());

        c2.buySnack(2, s4);
        System.out.println("Cash on Hand of Bob (Customer2)" + c2.getCashOnHand());
        System.out.println("Quantity of Snack4" + s4.getQuantity());

        c1.addCash(10.00);
        System.out.println("Cash on Hand of Jane (Customer1)" + c1.getCashOnHand());
        System.out.println("Quantity of Snack4" + s4.getQuantity());

        c1.buySnack(1, s2);
        System.out.println("Cash on Hand of Jane (Customer1)" + c1.getCashOnHand());
        System.out.println("Quantity of Snack2" + s2.getQuantity());

        s3.addQuantity(12);
        System.out.println("Quantity of Snack3" + s3.getQuantity());

        c2.buySnack(3,s3);
        System.out.println("Cash on Hand of Bob (Customer2)" + c2.getCashOnHand());
        System.out.println("Quantity of Snack3" + s3.getQuantity());

        s1.printSnackInfo();
    }
}
