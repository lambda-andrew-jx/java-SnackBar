package snackBarApp;

import java.util.ArrayList; // import the ArrayList class
import java.text.DecimalFormat; // import for decimal formatting

public class Main {
  private static DecimalFormat df2 = new DecimalFormat("#.##");
  public static ArrayList<Customer> customerList = new ArrayList<Customer>();
  public static ArrayList<Machine> machineList = new ArrayList<Machine>();
  public static ArrayList<Snack> snackList = new ArrayList<Snack>();

  public static void main(String[] args) {
    doLists();
  }

  public static void doLists() {
    Customer c1 = new Customer("Jane", 45.25);
    customerList.add(c1);
    Customer c2 = new Customer("Bob", 33.14);
    customerList.add(c2);

    Machine m1 = new Machine("Food");
    machineList.add(m1);
    Machine m2 = new Machine("Drink");
    machineList.add(m2);
    Machine m3 = new Machine("Office");
    machineList.add(m3);

    Snack s1 = new Snack("Chip", 1.75, 1, 36);
    snackList.add(s1);
    Snack s2 = new Snack("Chocolate Bar", 1.00, 1, 36);
    snackList.add(s2);
    Snack s3 = new Snack("Pretzel", 2.00, 1, 30);
    snackList.add(s3);
    Snack s4 = new Snack("Soda", 2.50, 2, 24);
    snackList.add(s4);
    Snack s5 = new Snack("Water", 2.75, 2, 20);
    snackList.add(s5);

    System.out.println("*** Snack Bar Saga ***\n");
    // a bunch of purchases...
    purchase(1, 3, 4);
    purchase(1, 1, 3);
    purchase(2, 2, 4);
    // cust 1 finds $10
    double moreCash = 10.00;
    c1.setCash(c1.getCash() + moreCash);
    System.out.println(c1.getName() + " has found $" + df2.format(moreCash) + "! " + c1.getName() + " now has $"
        + df2.format(c1.getCash()) + ".");
    // more purchasing...
    purchase(1, 1, 2);
    // add 12 more of snack 3 & print total of snack 3
    int snackUp = 12;
    s3.addSnack(snackUp);
    System.out.println(snackUp + " more " + s3.getName() + "s have been added to the machine. There are now "
        + s3.getQuantity() + " " + s3.getName() + "s available for purchase.\n");
    // final purchase...
    purchase(2, 3, 3);
    // final report
    inventory();
  }

  public static void purchase(int custId, int amount, int snackId) {
    Customer cust = customerList.get(custId - 1);
    Snack snack = snackList.get(snackId - 1);
    Machine machine = machineList.get(snack.getMachineId() - 1);
    System.out.println(
        cust.getName() + " buys " + amount + " " + snack.getName() + "s from the " + machine.getName() + " machine.");
    snack.buySnack(amount);
    double amtSpent = snack.getTotalCost(amount);
    double cashLeft = cust.getCash() - amtSpent;
    cust.setCash(cashLeft);

    System.out.println(cust.getName() + " has $" + df2.format(cust.getCash()) + " left. There are "
        + snack.getQuantity() + " " + snack.getName() + "s left in the " + machine.getName() + " machine.\n");

  }

  public static void inventory() {
    System.out.println("*** INVENTORY ***\n");
    // for every snack in the machines
    int snacks = snackList.size();
    for (int i = 0; i < snacks; i++) {
      Snack snack = snackList.get(i);
      Machine machine = machineList.get(snack.getMachineId() - 1);
      System.out.println("There are " + snack.getQuantity() + " " + snack.getName() + "s in the " + machine.getName()
          + " machine worth a total of $" + df2.format(snack.getTotalCost(snack.getQuantity())) + ".");
    }
  }

}
