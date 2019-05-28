package snackbarapp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String snack;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String snack, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;
        this.snack = snack;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;

    }

    /**
     * @return the snack
     */
    public String getSnack() {
        return snack;
    }

    /**
     * @param snack the snack to set
     */
    public void setSnack(String snack) {
        this.snack = snack;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the vendingMachineId
     */
    public int getVendingMachineId() {
        return vendingMachineId;
    }

    /**
     * @param vendingMachineId the vendingMachineId to set
     */
    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    /**
     * @param quantity the quantity to set
     */
    public void addQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
        } else {
            System.out.println("You're supposed be stocking the shelves, not robbing me, Jerry!");
        }

    }

    public double buySnack(double custAccBalance, int reqAmt) {
        if (reqAmt <= this.quantity && this.cost <= custAccBalance) {
            System.out.println("your total comes out to $" + getTotalCost(reqAmt));
            this.quantity = this.quantity - reqAmt;
            System.out.println("There are " + this.quantity + " " + this.snack + "'s left in stock");
            return custAccBalance - getTotalCost(reqAmt);
        } else {
            System.out.println("You ain't got the cash!");
            return custAccBalance;
        }
    }

    private double getTotalCost(int reqAmt) {
        return reqAmt * this.cost;
    }
}