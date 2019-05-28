package snackbarApp;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int qauntity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int qauntity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.qauntity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }
    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }
    public int getQuantity(){
        return qauntity;
    }
    public void setQuantity(int quantity)
    {
        this.qauntity = quantity;
    }
    public void addQuantity(int quantity, int newQuantity)
    {
        this.quantity += newQauntity;
    }
    public void buySnack(int snack, int numberOfSnacks)
    {
        this.snack = snack * numberOfSnacks;
    }
    public double getTotal(double cost, int quantity)
    {
        return cost * quantity;
    }
}
