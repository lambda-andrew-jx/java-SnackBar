public class Customer {
    private static int maxId = 0;
    private int id;
    private String fname;
    private double cashOnHand;

    public Customer(String fname, double cashOnHand) {
        maxId++;
        id = maxId;
        this.fname = fname;
        this.cashOnHand = cashOnHand;
    }

    public int getId() {
        return id;
    }

    public void addCash(double cashOnHand)
    {
        this.cashOnHand += cashOnHand;
    }

    public void buySnack(int quantity, Snack snack)
    {
        snack.buySnack(quantity);
        this.cashOnHand -= snack.getTotalCost(quantity);
    }

    public String getName()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }


    public double getCashOnHand()
    {
        return cashOnHand;
    }

}