package snackBarApp;

;

public class Snack {
  // fields
  private static int maxId = 0;
  private int id;
  private String name;
  private double cost;
  private int machineId;
  private int quantity;

  // constructors
  public Snack(String name, double cost, int machineId, int quantity) {
    maxId++;
    id = maxId;

    this.name = name;
    this.cost = cost;
    this.machineId = machineId;
    this.quantity = quantity;
  }

  // methods
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCost() {
    return cost;
  }

  public int getMachineId() {
    return machineId;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getTotalCost(int amount) {
    return amount * this.cost;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void setMachineId(int machineId) {
    this.machineId = machineId;
  }

  public void addSnack(int amount) {
    this.quantity += amount;
  }

  public void buySnack(int amount) {
    if (amount <= this.quantity) {
      this.quantity -= amount;
    }

  }

}