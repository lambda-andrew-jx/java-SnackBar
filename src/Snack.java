public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double costInCents;
    private int vendingMachineId;

    public Snack(String name, int quantity, int costInCents, int vendingMachineId) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.costInCents = costInCents;
        this.vendingMachineId = vendingMachineId;
    }

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


    public double getCostInCents(){
       return costInCents;
    }

    public void setCostInCents(double costInCents) {
        this.costInCents = costInCents;
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
        return costInCents * quantity;
    }


}