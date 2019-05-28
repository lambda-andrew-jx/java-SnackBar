package snackBarApp;

;

public class Main {

  public static void main(String[] args) {
    // setup
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);
    ArrayList<Machine> machineList = new ArrayList<Machine>();
    Machine m1 = new Machine("Food");
    machineList.add(m1);
    Machine m2 = new Machine("Drink");
    machineList.add(m2);
    Machine m3 = new Machine("Office");
    machineList.add(m3);

    Snack s1 = new Snack("Chips", 1.75, 1, 36);
    Snack s2 = new Snack("Chocolate Bar", 1.00, 1, 36);
    Snack s3 = new Snack("Pretzel", 2.00, 1, 30);
    Snack s4 = new Snack("Soda", 2.50, 2, 24);
    Snack s5 = new Snack("Water", 2.75, 2, 20);
    // doing stuff

    System.out.println("*** Snack Bar Saga ***");

    System.out.println(c1.getName() + " buys three " + s4.getName() + "s from the"
        + machineList.get(s4.getMachineId() + 1).getName() + " machine.");

    System.out.println(c1.getName());
  }

}