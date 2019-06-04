public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;
    //field
    //It's private because you don't want to change this

    public Snack(String name, int quantity, double costInCents, int vendingMachineId) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = costInCents;
        this.vendingMachineId = vendingMachineId;
    }
    //constructor

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getCost(){
       return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public void addQuantity(int quantity){
        this.quantity += quantity;
    }

    public void buySnack(int quantity){
        this.quantity -= quantity;
    }

    public double getTotalCost(int quantity)
    {
        return cost * quantity;
    }
    public void printSnackInfo ()
    {
        System.out.println("name:" + this.name);
        System.out.println("vendingMachineId:"+ this.vendingMachineId);
        System.out.println("Quantity:" +this.quantity);
        System.out.println("The left over:" +this.cost*this.quantity);
    }
}